package com.example.first.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.first.model.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Long>{

}
