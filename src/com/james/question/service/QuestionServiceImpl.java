package com.james.question.service;

import com.james.question.entity.Answer;
import com.james.question.entity.Question;
import com.james.question.form.AnswerForm;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class QuestionServiceImpl  implements QuestionService{

    private List<Question> questions;
    private static final  Log logger= LogFactory.getLog(QuestionServiceImpl.class);

    @Override
    public List<Question> getAllQuestions() {
        return questions;
    }
    public QuestionServiceImpl(){

        questions=new ArrayList<>();

        Question question1=new Question(1,"Which team is 2017 NBA champion?",
                "Golden State Warriors",10);
        Question question2 =new Question(2,"windows OS is created by?",
                "MicroSoft",20);
        Question question3=new Question(3,"java is created by?","Sun",20);

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);

    }

    @Override
    public Question getQuestion(int id) {
        Question target=null;
        for(Question question:questions){
            if (question.getId()==id){
                target=question;


            }
        }
        return target;
    }

    @Override
    public int getScore(AnswerForm answerForm) {
        int score=0;
        for(Answer answer:answerForm.getAnswers()){
            Question question=getQuestion(answer.getQuestionId());
            logger.info(question.getId()+":"+answer.getAnswer()+" "+question.getCorrectAnswer());
            if(answer.getAnswer().equals(question.getCorrectAnswer())){
                score+=question.getPoint();

            }
        }
        return score;
    }
}
