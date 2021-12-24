package com.oracle.ms.elastic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.ms.elastic.model.Book;
import com.oracle.ms.elastic.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	BookServiceImpl(BookRepository bookRepository){
		this.bookRepository = bookRepository;
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book findOne(String id) {
		return bookRepository.findById(id).get();
	}

}
