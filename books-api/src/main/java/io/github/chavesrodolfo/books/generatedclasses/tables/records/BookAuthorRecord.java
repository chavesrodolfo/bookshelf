/*
 * This file is generated by jOOQ.
*/
package io.github.chavesrodolfo.books.generatedclasses.tables.records;


import io.github.chavesrodolfo.books.generatedclasses.tables.BookAuthor;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class BookAuthorRecord extends TableRecordImpl<BookAuthorRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 384067394;

    /**
     * Setter for <code>PUBLIC.BOOK_AUTHOR.AUTHOR_ID</code>.
     */
    public void setAuthorId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK_AUTHOR.AUTHOR_ID</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BOOK_AUTHOR.BOOK_ID</code>.
     */
    public void setBookId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK_AUTHOR.BOOK_ID</code>.
     */
    public Integer getBookId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return BookAuthor.BOOK_AUTHOR.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return BookAuthor.BOOK_AUTHOR.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookAuthorRecord value1(Integer value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookAuthorRecord value2(Integer value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookAuthorRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookAuthorRecord
     */
    public BookAuthorRecord() {
        super(BookAuthor.BOOK_AUTHOR);
    }

    /**
     * Create a detached, initialised BookAuthorRecord
     */
    public BookAuthorRecord(Integer authorId, Integer bookId) {
        super(BookAuthor.BOOK_AUTHOR);

        set(0, authorId);
        set(1, bookId);
    }
}