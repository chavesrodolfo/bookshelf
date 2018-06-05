package io.github.chavesrodolfo.books.representations;

import java.util.Date;
import java.util.List;

import io.github.chavesrodolfo.books.generatedclasses.tables.pojos.Book;

public class BookVO {

	private String isbn;
	private String title;
	private String subtitle;
	private List<String> authors;
	private Date published;
	private String publisher;
	private Integer pages;
	private String description;
	private Boolean instock;
	

	public BookVO(Book book, List<String> authors) {
		this.isbn = book.getIsbn();
		this.title = book.getTitle();
		this.subtitle = book.getSubtitle();
		this.published = book.getPublished();
		this.publisher = book.getPublisher();
		this.pages = book.getPages();
		this.description = book.getDescription();
		this.instock = book.getInstock();
		this.authors = authors;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public Date getPublished() {
		return published;
	}

	public String getPublisher() {
		return publisher;
	}

	public Integer getPages() {
		return pages;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getInstock() {
		return instock;
	}

	public List<String> getAuthors() {
		return authors;
	}

}
