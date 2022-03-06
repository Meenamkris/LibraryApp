package com.galvanize.tmo.paspringstarter.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.galvanize.tmo.paspringstarter.domain.Book;

@Component
public class BookService {

	public Book addBook(Book book) {
		book.setId(1);
		return book;
	}

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		Book book = new Book();
		book.setId(2);
		book.setAuthor("Philip K. Dick");
		book.setTitle("Do Androids Dream of Electric Sheep?");
		book.setYearPublished(1968);
		books.add(book);
		
		
		Book book2 = new Book();
		book2.setId(3);
		book2.setAuthor("William Gibson");
		book2.setTitle("Neuromancer");
		book2.setYearPublished(1984);
		books.add(book2);
		
		
		Book book3 = new Book();
		book3.setId(1);
		book3.setAuthor("Douglas Adams");
		book3.setTitle("The Hitchhiker's Guide to the Galaxy");
		book3.setYearPublished(1979);
		books.add(book3);
		
		return books;
	}

}
