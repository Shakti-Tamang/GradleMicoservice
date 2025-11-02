package com.example.first.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first.model.Question;
import com.example.first.repo.QuestionRepo;

import com.example.first.dto.CorrectAnswerDto;

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

    @Override
    public Integer getScore(List<CorrectAnswerDto> ids) {
        int score=0;
        for(CorrectAnswerDto dto : ids ) {
     Question question=questionRepo.findById(dto.getId()).orElse(null);
     if(question.getRightAnswer().equalsIgnoreCase(dto.getSelectedAnswer())) {
         score++;
        }
    }


    return score;

}
}