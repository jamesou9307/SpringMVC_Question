package com.james.question.entity;

import java.io.Serializable;

public class Question implements Serializable{

    private int id;
    private String description;
    private String correctAnswer;
    private int point;

    public Question() {
    }

    public Question(int id, String description, String correctAnswer,int point) {
        this.id = id;
        this.description = description;
        this.correctAnswer = correctAnswer;
        this.point=point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
