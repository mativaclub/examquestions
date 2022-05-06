package com.examquestions.examquestions.service.impl;

import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
import com.examquestions.examquestions.model.Question;
import com.examquestions.examquestions.service.ExaminerService;
import com.examquestions.examquestions.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {

    public final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int questionsAmount) {
        Set<Question> questions = new HashSet<>();
        if (questionsAmount > questionService.getAll().size()) {
            throw new InvalidAmountQuestionsException();
        }
        while(questions.size() != questionsAmount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }

}


