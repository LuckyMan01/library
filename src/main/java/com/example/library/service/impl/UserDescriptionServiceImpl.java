package com.example.library.service.impl;

import com.example.library.model.UserCard;
import com.example.library.repository.UserDescriptionRepository;
import com.example.library.service.UserDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class UserDescriptionServiceImpl implements UserDescriptionService {
    @Autowired
    UserDescriptionRepository repository;

    @Override
    @Transactional
    public UserCard create(UserCard description) {
        return repository.save(description);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        UserCard deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public UserCard update(UserCard description) {
        UserCard updated = repository.getReferenceById(description.getId());
        repository.saveAndFlush(description);
        return updated;
    }

    @Override
    public UserCard findById(Long id) {
        return repository.getReferenceById(id);
    }
}
