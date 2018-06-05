package io.github.chavesrodolfo.books.dao;

import static io.github.chavesrodolfo.books.generatedclasses.Tables.AUTHOR;
import static io.github.chavesrodolfo.books.generatedclasses.Tables.BOOK;
import static io.github.chavesrodolfo.books.generatedclasses.Tables.BOOK_AUTHOR;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chavesrodolfo.books.generatedclasses.tables.pojos.Author;
import io.github.chavesrodolfo.books.generatedclasses.tables.pojos.Book;

public class BookshelfDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookshelfDao.class);
	
	private DSLContext ctx;

	public BookshelfDao(Configuration conf, Connection conn) {
		this.ctx = DSL.using(conn, conf.dialect());
	}

	/**
	 * Find a {@link Book} by title or description
	 * @param param - query param to find a book
	 * @return Map - key Book and value with a list of authors' name
	 */
	public Map<Book, List<String>> findBookByTitleOrDescription(String param) {
		
		LOGGER.debug("Locate BookshelfDao - begin");
		
		Result<?> result = ctx.select()
	            .from(BOOK)
	            .leftJoin(BOOK_AUTHOR)
	            .on(BOOK_AUTHOR.BOOK_ID.eq(BOOK.BOOK_ID))
        		.leftJoin(AUTHOR)
	            .on(AUTHOR.AUTHOR_ID.eq(BOOK_AUTHOR.AUTHOR_ID))		            
	            .where(BOOK.TITLE.like("%" + param + "%").or(BOOK.DESCRIPTION.likeIgnoreCase("%" + param + "%")))
	            .fetch();
		
		Map<Book, List<String>> mapBookAuthors = new HashMap<Book, List<String>>();
		
		LOGGER.debug("Building mapBookAuthors");
		
		// Building a map with key Book and value with a list of authors' name
		for (Record record : result) {
			Book book = record.into(Book.class);
			
			Author author = record.into(Author.class);
			List<String> authorsName = new ArrayList<String>();
			authorsName.add(author.getName());
			
			// Including only distinct books with their authors
			if(!mapBookAuthors.containsKey(book)) {
				mapBookAuthors.put(book, authorsName);
			} else {
				authorsName.addAll(mapBookAuthors.get(book));
				mapBookAuthors.put(book, authorsName);
			}
		}
		
		LOGGER.debug("Locate BookshelfDao - end");
		
		return mapBookAuthors;
	}
}
