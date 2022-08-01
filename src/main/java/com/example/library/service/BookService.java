package com.example.library.service;

import com.example.library.model.Book;

public interface BookService {
    Book create(Book book);
    boolean delete(Long id);
    Book update(Book book);
    Book findById(Long id);
}
