package com.example.library;

import com.example.library.model.Book;
import com.example.library.model.BookDescription;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
		Book book =  new Book();
		BookDescription description =  new BookDescription();


	}

}