package com.example.library.service;

import com.example.library.model.Client;

public interface UserService {
    Client create(Client client);
    boolean delete(Long id);
    Client update(Client client);
    Client findById(Long id);

}
