package com.example.first.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.first.apiresponse.ApiResponse;
import com.example.first.model.Question;
import com.example.first.service.QuestionService;


import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/save-question")
    public ResponseEntity<ApiResponse> saveQuestion(@RequestBody  Question  question) {
        questionService.QuestionServiceMethod(question);

        ApiResponse apiResponse =ApiResponse.builder().message("Question saved successfully").status_code(HttpStatus.OK.value()).build();
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse); 
    } 

    @GetMapping("/lists")
     public ResponseEntity<ApiResponse> saveQuestion() {
      List<Question> list= questionService.getQuestionsByQuizId();

        ApiResponse apiResponse =ApiResponse.<Question>builder().message("Question lists").listData(list).status_code(HttpStatus.OK.value()).build();
        return ResponseEntity.status(HttpStatus.OK).body(apiResponse); 
    } 

}
