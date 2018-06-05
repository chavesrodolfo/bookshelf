package io.github.chavesrodolfo.books.representations;

import java.util.List;

/**
 *	Representation of Bookshelf - List of books
 */
public class Bookshelf {

	List<BookVO> bookShelf;

	public Bookshelf(List<BookVO> books) {
		this.bookShelf = books;
	}

	public Bookshelf() {
	}

	public List<BookVO> getBookShelf() {
		return bookShelf;
	}

	public void setBookShelf(List<BookVO> bookShelf) {
		this.bookShelf = bookShelf;
	}

}
