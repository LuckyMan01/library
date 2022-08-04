package com.example.library.service.impl;

import com.example.library.model.BookDescription;
import com.example.library.repository.BookDescriptionRepository;
import com.example.library.service.BookDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class BookDescriptionServiceImpl implements BookDescriptionService {
    @Autowired
    private BookDescriptionRepository repository;

    @Override
    @Transactional
    public BookDescription create(BookDescription entity) {
        return repository.save(entity);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        BookDescription deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public BookDescription update(BookDescription entity) {
        BookDescription updated = repository.getReferenceById(entity.getId());
        repository.saveAndFlush(entity);
        return updated;
    }

    @Override
    public BookDescription findById(Long id) {
        return repository.getReferenceById(id);
    }
}
