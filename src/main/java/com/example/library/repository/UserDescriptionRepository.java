package com.example.library.repository;

import com.example.library.model.UserCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDescriptionRepository extends JpaRepository<UserCard, Long> {
}
