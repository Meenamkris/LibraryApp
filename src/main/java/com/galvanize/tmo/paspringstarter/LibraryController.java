package com.galvanize.tmo.paspringstarter;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.galvanize.tmo.paspringstarter.domain.*;
import com.galvanize.tmo.paspringstarter.service.BookService;

@RestController
public class LibraryController {  
	
	@Autowired
	BookService bookService;

    @GetMapping("/health")
    public void health() {
    }
    
    @PostMapping("/api/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
    	Book bookResponse= bookService.addBook(book);    	
    	return new ResponseEntity<>(bookResponse,HttpStatus.CREATED);
    }
    
    @GetMapping("/api/books")
    @ResponseStatus(HttpStatus.OK)
    public Map<String, List<Book>>   getBooks(){
    	
    	Map<String, List<Book>> books= bookService.getBooks();    	
    	 return books;
    }
    
    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBooks(){   	
    	bookService.deleteBooks();
    }
}
