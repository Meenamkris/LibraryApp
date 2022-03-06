package com.galvanize.tmo.paspringstarter.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.galvanize.tmo.paspringstarter.domain.Book;

@Component
public class BookService {
	
	ArrayList<Book> bookList = new ArrayList<Book>();

	public Book addBook(Book book) {		
		book.setId(bookList.size()+1);
		bookList.add(book);
		return book;
	}

	public Map<String, List<Book>> getBooks() {	
		
		   Collections.sort(bookList, new Comparator<Book>() {
	            @Override
	            public int compare(Book o1, Book o2) {
	                return o1.getTitle().compareTo(o2.getTitle());
	            }
	        });
	        Map<String, List<Book>> books = new HashMap<String, List<Book>>();
	        books.put("books", bookList);
	        return books;	}

	public void deleteBooks() {
		bookList.clear();
		
	}

}
