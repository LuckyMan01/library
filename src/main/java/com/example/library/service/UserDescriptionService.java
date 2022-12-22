package com.example.library.service;

import com.example.library.model.UserCard;

public interface UserDescriptionService {
    UserCard create(UserCard description);

    boolean delete(Long id);

    UserCard update(UserCard description);

    UserCard findById(Long id);
}
