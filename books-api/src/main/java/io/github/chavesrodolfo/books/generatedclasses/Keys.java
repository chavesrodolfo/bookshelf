/*
 * This file is generated by jOOQ.
*/
package io.github.chavesrodolfo.books.generatedclasses;


import io.github.chavesrodolfo.books.generatedclasses.tables.Author;
import io.github.chavesrodolfo.books.generatedclasses.tables.Book;
import io.github.chavesrodolfo.books.generatedclasses.tables.BookAuthor;
import io.github.chavesrodolfo.books.generatedclasses.tables.FlywaySchemaHistory;
import io.github.chavesrodolfo.books.generatedclasses.tables.records.AuthorRecord;
import io.github.chavesrodolfo.books.generatedclasses.tables.records.BookAuthorRecord;
import io.github.chavesrodolfo.books.generatedclasses.tables.records.BookRecord;
import io.github.chavesrodolfo.books.generatedclasses.tables.records.FlywaySchemaHistoryRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<BookRecord> CONSTRAINT_1 = UniqueKeys0.CONSTRAINT_1;
    public static final UniqueKey<AuthorRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<BookAuthorRecord, AuthorRecord> FK_AUTHOR = ForeignKeys0.FK_AUTHOR;
    public static final ForeignKey<BookAuthorRecord, BookRecord> FK_BOOK = ForeignKeys0.FK_BOOK;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<BookRecord> CONSTRAINT_1 = createUniqueKey(Book.BOOK, "CONSTRAINT_1", Book.BOOK.BOOK_ID);
        public static final UniqueKey<AuthorRecord> CONSTRAINT_7 = createUniqueKey(Author.AUTHOR, "CONSTRAINT_7", Author.AUTHOR.AUTHOR_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<BookAuthorRecord, AuthorRecord> FK_AUTHOR = createForeignKey(io.github.chavesrodolfo.books.generatedclasses.Keys.CONSTRAINT_7, BookAuthor.BOOK_AUTHOR, "FK_AUTHOR", BookAuthor.BOOK_AUTHOR.AUTHOR_ID);
        public static final ForeignKey<BookAuthorRecord, BookRecord> FK_BOOK = createForeignKey(io.github.chavesrodolfo.books.generatedclasses.Keys.CONSTRAINT_1, BookAuthor.BOOK_AUTHOR, "FK_BOOK", BookAuthor.BOOK_AUTHOR.BOOK_ID);
    }
}
