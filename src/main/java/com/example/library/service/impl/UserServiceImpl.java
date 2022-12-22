package com.example.library.service.impl;

import com.example.library.model.Client;
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
    public Client create(Client client) {
        return repository.save(client);
    }

    @Override
    @Transactional
    public boolean delete(Long id) {
        Client deleted = repository.getReferenceById(id);
        repository.delete(deleted);
        return true;
    }

    @Override
    @Transactional
    public Client update(Client client) {
        Client updated = repository.getReferenceById(client.getId());
        repository.saveAndFlush(client);
        return updated;
    }

    @Override
    public Client findById(Long id) {
        return repository.getReferenceById(id);
    }
}
