package com.james.question.service;

import com.james.question.entity.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();
    Question getQuestion(int id);
}
