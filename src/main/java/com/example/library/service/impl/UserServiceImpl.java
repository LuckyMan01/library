package com.example.library.service.impl;

import com.example.library.model.User;
import com.example.library.repository.UserRepository;
import com.example.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;

    @Override
    @Transactional
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        User deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public User update(User user) {
        User updated = repository.getReferenceById(user.getId());
        repository.saveAndFlush(user);
        return updated;
    }

    @Override
    public User findById(Long id) {
        return repository.getReferenceById(id);
    }
}
