package com.example.library.service.impl;

import com.example.library.model.UserDescription;
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
    public UserDescription create(UserDescription description) {
        return repository.save(description);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        UserDescription deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public UserDescription update(UserDescription description) {
        UserDescription updated = repository.getReferenceById(description.getId());
        repository.saveAndFlush(description);
        return updated;
    }

    @Override
    public UserDescription findById(Long id) {
        return repository.getReferenceById(id);
    }
}
