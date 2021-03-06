/*
 * This file is generated by jOOQ.
*/
package io.github.chavesrodolfo.books.generatedclasses.tables;


import io.github.chavesrodolfo.books.generatedclasses.Keys;
import io.github.chavesrodolfo.books.generatedclasses.Public;
import io.github.chavesrodolfo.books.generatedclasses.tables.records.BookRecord;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Book extends TableImpl<BookRecord> {

    private static final long serialVersionUID = 759777269;

    /**
     * The reference instance of <code>PUBLIC.BOOK</code>
     */
    public static final Book BOOK = new Book();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookRecord> getRecordType() {
        return BookRecord.class;
    }

    /**
     * The column <code>PUBLIC.BOOK.BOOK_ID</code>.
     */
    public final TableField<BookRecord, Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK.ISBN</code>.
     */
    public final TableField<BookRecord, String> ISBN = createField("ISBN", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>PUBLIC.BOOK.TITLE</code>.
     */
    public final TableField<BookRecord, String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK.SUBTITLE</code>.
     */
    public final TableField<BookRecord, String> SUBTITLE = createField("SUBTITLE", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>PUBLIC.BOOK.PUBLISHED</code>.
     */
    public final TableField<BookRecord, Date> PUBLISHED = createField("PUBLISHED", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>PUBLIC.BOOK.PUBLISHER</code>.
     */
    public final TableField<BookRecord, String> PUBLISHER = createField("PUBLISHER", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>PUBLIC.BOOK.PAGES</code>.
     */
    public final TableField<BookRecord, Integer> PAGES = createField("PAGES", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>PUBLIC.BOOK.DESCRIPTION</code>.
     */
    public final TableField<BookRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK.INSTOCK</code>.
     */
    public final TableField<BookRecord, Boolean> INSTOCK = createField("INSTOCK", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>PUBLIC.BOOK</code> table reference
     */
    public Book() {
        this("BOOK", null);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK</code> table reference
     */
    public Book(String alias) {
        this(alias, BOOK);
    }

    private Book(String alias, Table<BookRecord> aliased) {
        this(alias, aliased, null);
    }

    private Book(String alias, Table<BookRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookRecord>> getKeys() {
        return Arrays.<UniqueKey<BookRecord>>asList(Keys.CONSTRAINT_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Book as(String alias) {
        return new Book(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Book rename(String name) {
        return new Book(name, null);
    }
}
