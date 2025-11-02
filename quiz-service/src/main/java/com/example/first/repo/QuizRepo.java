package com.example.first.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.entity.Quiz;

@Repository
public interface QuizRepo extends JpaRepository<Quiz, Long> {

}
