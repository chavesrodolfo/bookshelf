/*
 * This file is generated by jOOQ.
*/
package io.github.chavesrodolfo.books.generatedclasses;


import io.github.chavesrodolfo.books.generatedclasses.tables.Author;
import io.github.chavesrodolfo.books.generatedclasses.tables.Book;
import io.github.chavesrodolfo.books.generatedclasses.tables.BookAuthor;
import io.github.chavesrodolfo.books.generatedclasses.tables.FlywaySchemaHistory;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = io.github.chavesrodolfo.books.generatedclasses.tables.FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public static final Book BOOK = io.github.chavesrodolfo.books.generatedclasses.tables.Book.BOOK;

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public static final Author AUTHOR = io.github.chavesrodolfo.books.generatedclasses.tables.Author.AUTHOR;

    /**
     * The table <code>PUBLIC.BOOK_AUTHOR</code>.
     */
    public static final BookAuthor BOOK_AUTHOR = io.github.chavesrodolfo.books.generatedclasses.tables.BookAuthor.BOOK_AUTHOR;
}
