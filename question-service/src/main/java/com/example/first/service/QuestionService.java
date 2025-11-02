package com.example.first.service;

import java.util.List;

import com.example.first.dto.CorrectAnswerDto;
import com.example.first.model.Question;

public interface QuestionService {

    public void QuestionServiceMethod(Question question);

    public List<Question> getQuestionsByQuizId();

    public Integer getScore(List<CorrectAnswerDto> ids);

}
