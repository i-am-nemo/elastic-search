package com.oracle.ms.elastic.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "book-poc")
public class Book {

	  @Id
	  private String id;
	  
	  @Field(type = FieldType.Text, name = "title")
	  private String title;
	  
	  @Field(type = FieldType.Text, name = "author")
	  private String author;

	public Book(String id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	  

	  
	 
}
