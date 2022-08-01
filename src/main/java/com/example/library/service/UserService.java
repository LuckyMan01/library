package com.example.library.service;

import com.example.library.model.User;

public interface UserService {
    User create(User user);
    boolean delete(Long id);
    User update(User user);
    User findById(Long id);
}
