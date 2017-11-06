package com.james.question.service;

import com.james.question.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl  implements QuestionService{

    private List<Question> questions;

    @Override
    public List<Question> getAllQuestions() {
        return questions;
    }

}
