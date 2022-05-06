package com.examquestions.examquestions.controller;

import com.examquestions.examquestions.model.Question;
import com.examquestions.examquestions.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
public class ExamController {

    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/get/{amount}")
    Collection<Question> getAllQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
