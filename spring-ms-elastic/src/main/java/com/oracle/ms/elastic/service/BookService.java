package com.oracle.ms.elastic.service;

import com.oracle.ms.elastic.model.Book;

public interface BookService {

	Book save(Book book);
	
	Book findOne(String id);
}
