package com.examquestions.examquestions.service;

import com.examquestions.examquestions.model.Question;

import java.util.Collection;

public interface QuestionService {

    Question add(String question, String answer);
    Question remove(String question, String answer);

    Collection<Question> getAll();

    Question getRandomQuestion();

    int getSize();


}
