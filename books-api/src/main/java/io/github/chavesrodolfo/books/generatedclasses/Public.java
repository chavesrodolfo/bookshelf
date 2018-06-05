/*
 * This file is generated by jOOQ.
*/
package io.github.chavesrodolfo.books.generatedclasses;


import io.github.chavesrodolfo.books.generatedclasses.tables.Author;
import io.github.chavesrodolfo.books.generatedclasses.tables.Book;
import io.github.chavesrodolfo.books.generatedclasses.tables.BookAuthor;
import io.github.chavesrodolfo.books.generatedclasses.tables.FlywaySchemaHistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = -1368532580;

    /**
     * The reference instance of <code>PUBLIC</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>PUBLIC.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = io.github.chavesrodolfo.books.generatedclasses.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public final Book BOOK = io.github.chavesrodolfo.books.generatedclasses.tables.Book.BOOK;

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public final Author AUTHOR = io.github.chavesrodolfo.books.generatedclasses.tables.Author.AUTHOR;

    /**
     * The table <code>PUBLIC.BOOK_AUTHOR</code>.
     */
    public final BookAuthor BOOK_AUTHOR = io.github.chavesrodolfo.books.generatedclasses.tables.BookAuthor.BOOK_AUTHOR;

    /**
     * No further instances allowed
     */
    private Public() {
        super("PUBLIC", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            Book.BOOK,
            Author.AUTHOR,
            BookAuthor.BOOK_AUTHOR);
    }
}