package com.example.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.model.Question;
import com.example.first.repo.QuestionRepo;
@Service
public class QuestionServiceImpl  implements QuestionService{

    @Autowired
    private QuestionRepo questionRepo;

    @Override
    public void QuestionServiceMethod(Question question) {

        questionRepo.save(question);

    }

    @Override
    public List<Question> getQuestionsByQuizId() {

        List<Question> questions = questionRepo.findAll();
        return questions.isEmpty() ? null : questions;
    }

}
