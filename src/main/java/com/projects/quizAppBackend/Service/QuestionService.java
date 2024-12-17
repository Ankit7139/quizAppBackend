package com.projects.quizAppBackend.Service;

import com.projects.quizAppBackend.Model.Question;

import java.util.List;


public interface QuestionService {
    public List<Question> getAllQuestions();
    public Question addQuestion(Question question);
}
