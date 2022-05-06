package com.examquestions.examquestions.service.impl;

import com.examquestions.examquestions.model.Question;
import com.examquestions.examquestions.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionServiceImpl implements QuestionService {

    private final Set<Question> questionStorage = new HashSet<>();
    private final Random random = new Random();

    @Override
    public Question add(String question, String answer) {
        Question newQuestion = new Question(question, answer);
        questionStorage.add(newQuestion);
        return newQuestion;

    }

    @Override
    public Question remove(String question, String answer) {
        Question removeQuestion = new Question(question, answer);
        questionStorage.remove(removeQuestion);
        return removeQuestion;

    }

    @Override
    public Collection<Question> getAll() {
        return Set.copyOf(questionStorage);
    }

    @Override
    public Question getRandomQuestion() {
        return List.copyOf(questionStorage).get(random.nextInt(questionStorage.size()));
    }

    @Override
    public int getSize() {
        return questionStorage.size();
    }
}
