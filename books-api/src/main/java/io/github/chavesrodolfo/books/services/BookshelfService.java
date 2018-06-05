package io.github.chavesrodolfo.books.services;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jooq.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.github.chavesrodolfo.books.dao.BookshelfDao;
import io.github.chavesrodolfo.books.generatedclasses.tables.pojos.Book;
import io.github.chavesrodolfo.books.representations.BookVO;
import io.github.chavesrodolfo.books.representations.Bookshelf;

public class BookshelfService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BookshelfService.class);
	
	private BookshelfDao bookshelfDao;
	
	public BookshelfService(Configuration conf, Connection conn) {
		this.bookshelfDao = new BookshelfDao(conf, conn);
	}

	/**
	 * Locate books by part of its title or description.
	 * @param param - query parameter to find a book
	 * @return {@link Bookshelf} - List of books
	 */
	public Bookshelf locateBooks(String param) {

		LOGGER.debug("Locate BookshelfService - begin");
		
		Map<Book, List<String>> mapBookAuthors = bookshelfDao.findBookByTitleOrDescription(param);
		
		List<BookVO> books = new ArrayList<BookVO>();
		
		LOGGER.debug("Building books list");
		
		for (Entry<Book, List<String>> entry : mapBookAuthors.entrySet()) {
			BookVO bookVO = new BookVO(entry.getKey(), entry.getValue());
			books.add(bookVO);
		}
		
		Bookshelf bookshelf = new Bookshelf(books);
		
		LOGGER.debug("Locate BookshelfService - end");
		
		return bookshelf;
	}

}
