package com.oracle.ms.elastic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.ms.elastic.model.Book;
import com.oracle.ms.elastic.service.BookService;


@RestController
@RequestMapping("books-rest")
public class BookController {

	@Autowired
    private BookService bookService;
	
	@GetMapping("/{id}")
	public Book find(@PathVariable String id) {
		return bookService.findOne(id);
        
	}
	
	@PostMapping("/test")
	public void insert() {
		bookService.save(new Book("1001", "Elasticsearch Basics", "Ram"));
        bookService.save(new Book("1002", "Apache Lucene Basics", "Shyam"));
        bookService.save(new Book("1003", "Apache Solr Basics", "Yadu"));
	}
}
