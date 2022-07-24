package com.example.library.repository;

import com.example.library.model.BookDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDescriptionRepository extends JpaRepository<BookDescription, Long> {
}
