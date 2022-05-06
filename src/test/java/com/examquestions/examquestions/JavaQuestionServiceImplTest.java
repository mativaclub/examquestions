package com.examquestions.examquestions;

import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
import com.examquestions.examquestions.model.Question;
import com.examquestions.examquestions.service.QuestionService;
import com.examquestions.examquestions.service.impl.ExaminerServiceImpl;
import com.examquestions.examquestions.service.impl.JavaQuestionServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.examquestions.examquestions.ConstantsTest.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceImplTest {

    @InjectMocks
    private JavaQuestionServiceImpl out;
    @Mock
    public QuestionService questionService;

    public JavaQuestionServiceImplTest(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Test
    void shouldAddQuestion() {
        Question expected = new Question(QUESTION_1, ANSWER_1);
        assertEquals(expected, out.add(QUESTION_1, ANSWER_1));
        assertEquals(1, out.getAll().size());
        assertTrue(out.getAll().contains(expected));
    }

    @Test
    void shouldRemoveQuestion() {
        Question expected = new Question(QUESTION_1, ANSWER_1);
        out.add(QUESTION_1, ANSWER_1);
        assertEquals(1, out.getAll().size());
        assertTrue(out.getAll().contains(expected));
        assertEquals(expected, out.remove(QUESTION_1, ANSWER_1));
        assertEquals(0, out.getAll().size());

    }

    @Test
    void shouldGetAllQuestions() {
        out.add(QUESTION_1, ANSWER_1);
        out.add(QUESTION_2, ANSWER_2);
        out.add(QUESTION_3, ANSWER_3);
        assertEquals(QUESTIONS_1, out.getAll());

    }

    @Test
    void getRandomQuestion() {
        out.add(QUESTION_1, ANSWER_1);
        out.add(QUESTION_2, ANSWER_2);
        out.add(QUESTION_3, ANSWER_3);
        assertEquals(QUESTIONS_1, out.getRandomQuestion());

    }




}
