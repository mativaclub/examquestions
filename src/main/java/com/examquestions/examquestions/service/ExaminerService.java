package com.examquestions.examquestions.service;

import com.examquestions.examquestions.model.Question;

import java.util.Collection;

public interface ExaminerService {

    Collection<Question> getQuestions(int questionsAmount);

}
