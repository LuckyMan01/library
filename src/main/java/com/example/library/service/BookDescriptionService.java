package com.example.library.service;

import com.example.library.model.BookDescription;

public interface BookDescriptionService {

    BookDescription create(BookDescription description);

    boolean delete(Long id);

    BookDescription update(BookDescription description);

    BookDescription findById(Long id);

}
