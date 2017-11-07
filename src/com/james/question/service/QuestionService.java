package com.james.question.service;

import com.james.question.entity.Question;
import com.james.question.form.AnswerForm;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();
    Question getQuestion(int id);
    int getScore(AnswerForm answerForm);
}
