package com.example.library.service.impl;

import com.example.library.model.Book;
import com.example.library.repository.BookRepository;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;

    @Override
    @Transactional
    public Book create(Book entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        Book deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public Book update(Book entity) {
        Book updated = repository.getReferenceById(entity.getId());
        repository.saveAndFlush(entity);
        return updated;
    }

    @Override
    public Book findById(Long id) {
        return repository.getReferenceById(id);
    }
}
