package com.james.question.controller;

import com.james.question.entity.Question;
import com.james.question.service.QuestionService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class QuestionController {

    private static final Log logger= LogFactory.getLog(QuestionController.class);

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "/show_question")
    public String showQuestion(Model model){
        List<Question> questions=questionService.getAllQuestions();
        model.addAttribute("questions",questions);
        return "QuestionForm";
    }

}
