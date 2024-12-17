package com.projects.quizAppBackend.Controller;


import com.projects.quizAppBackend.Model.Question;
import com.projects.quizAppBackend.Service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;


    @GetMapping("/all-questions")
    public ResponseEntity<List<Question>> getAllQuestion(){
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @PostMapping("/add-question")
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){
        Question savedQues = questionService.addQuestion(question);
        return new ResponseEntity<>(savedQues, HttpStatus.CREATED);
    }
}
