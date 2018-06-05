DROP TABLE IF EXISTS book;
CREATE TABLE book (
  book_id INT NOT NULL,
  isbn VARCHAR(45) NULL,
  title VARCHAR(255) NOT NULL,
  subtitle VARCHAR(255) NULL,
  published DATE NULL,
  publisher VARCHAR(255) NULL,
  pages INT NULL,
  description VARCHAR(1024) NOT NULL,
  inStock BOOLEAN NULL,
  PRIMARY KEY (book_id));
  

DROP TABLE IF EXISTS author;
CREATE TABLE author (
  author_id INT NOT NULL,
  name VARCHAR(45) NOT NULL,
  PRIMARY KEY (author_id));

DROP TABLE IF EXISTS book_author;
CREATE TABLE book_author (
  author_id INT NOT NULL,
  book_id INT NOT NULL,
  CONSTRAINT fk_author
    FOREIGN KEY (author_id)
    REFERENCES author (author_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_book
    FOREIGN KEY (book_id)
    REFERENCES book (book_id)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);