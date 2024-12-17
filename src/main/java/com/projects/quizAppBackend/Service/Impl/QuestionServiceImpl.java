package com.projects.quizAppBackend.Service.Impl;

import com.projects.quizAppBackend.Model.Question;
import com.projects.quizAppBackend.Repository.QuestionRepository;
import com.projects.quizAppBackend.Service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public List<Question> getAllQuestions(){
       return questionRepository.findAll();
    }

    public Question addQuestion(Question question){
        questionRepository.save(question);
        return question;
    }


}
