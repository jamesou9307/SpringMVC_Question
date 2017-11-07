package com.james.question.form;

import com.james.question.entity.Answer;

import java.util.List;

public class AnswerForm {

    private List<Answer> answers;

    public AnswerForm() {
    }

    public AnswerForm(List<Answer> answers) {
        this.answers = answers;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
