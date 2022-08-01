package com.example.library.service;

import com.example.library.model.UserDescription;

public interface UserDescriptionService {
    UserDescription create(UserDescription description);

    boolean delete(Long id);

    UserDescription update(UserDescription description);

    UserDescription findById(Long id);
}
