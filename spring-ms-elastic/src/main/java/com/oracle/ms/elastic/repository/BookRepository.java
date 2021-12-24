package com.oracle.ms.elastic.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.oracle.ms.elastic.model.Book;

public interface BookRepository extends ElasticsearchRepository<Book, String> {
	 
	 
	}