/*
 * This file is generated by jOOQ.
*/
package io.github.chavesrodolfo.books.generatedclasses.tables.records;


import io.github.chavesrodolfo.books.generatedclasses.tables.Book;

import java.sql.Date;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


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
public class BookRecord extends UpdatableRecordImpl<BookRecord> implements Record9<Integer, String, String, String, Date, String, Integer, String, Boolean> {

    private static final long serialVersionUID = -745785068;

    /**
     * Setter for <code>PUBLIC.BOOK.BOOK_ID</code>.
     */
    public void setBookId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.BOOK_ID</code>.
     */
    public Integer getBookId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.ISBN</code>.
     */
    public void setIsbn(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.ISBN</code>.
     */
    public String getIsbn() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.TITLE</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.TITLE</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.SUBTITLE</code>.
     */
    public void setSubtitle(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.SUBTITLE</code>.
     */
    public String getSubtitle() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.PUBLISHED</code>.
     */
    public void setPublished(Date value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.PUBLISHED</code>.
     */
    public Date getPublished() {
        return (Date) get(4);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.PUBLISHER</code>.
     */
    public void setPublisher(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.PUBLISHER</code>.
     */
    public String getPublisher() {
        return (String) get(5);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.PAGES</code>.
     */
    public void setPages(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.PAGES</code>.
     */
    public Integer getPages() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.DESCRIPTION</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.DESCRIPTION</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>PUBLIC.BOOK.INSTOCK</code>.
     */
    public void setInstock(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.BOOK.INSTOCK</code>.
     */
    public Boolean getInstock() {
        return (Boolean) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, Date, String, Integer, String, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, Date, String, Integer, String, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Book.BOOK.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Book.BOOK.ISBN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Book.BOOK.TITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Book.BOOK.SUBTITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field5() {
        return Book.BOOK.PUBLISHED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Book.BOOK.PUBLISHER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Book.BOOK.PAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Book.BOOK.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Book.BOOK.INSTOCK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getIsbn();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSubtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value5() {
        return getPublished();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPublisher();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getInstock();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value1(Integer value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value2(String value) {
        setIsbn(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value3(String value) {
        setTitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value4(String value) {
        setSubtitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value5(Date value) {
        setPublished(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value6(String value) {
        setPublisher(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value7(Integer value) {
        setPages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord value9(Boolean value) {
        setInstock(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookRecord values(Integer value1, String value2, String value3, String value4, Date value5, String value6, Integer value7, String value8, Boolean value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Integer bookId, String isbn, String title, String subtitle, Date published, String publisher, Integer pages, String description, Boolean instock) {
        super(Book.BOOK);

        set(0, bookId);
        set(1, isbn);
        set(2, title);
        set(3, subtitle);
        set(4, published);
        set(5, publisher);
        set(6, pages);
        set(7, description);
        set(8, instock);
    }
}
