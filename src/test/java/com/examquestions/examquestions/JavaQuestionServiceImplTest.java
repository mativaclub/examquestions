package com.examquestions.examquestions;

import com.examquestions.examquestions.model.Question;
import com.examquestions.examquestions.service.impl.JavaQuestionServiceImpl;
import org.junit.jupiter.api.Test;

import static com.examquestions.examquestions.ConstantsTest.*;
import static org.junit.jupiter.api.Assertions.*;

public class JavaQuestionServiceImplTest {
    private JavaQuestionServiceImpl out = new JavaQuestionServiceImpl();


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
        assertEquals(QUESTION_SET, out.getAll());

    }

    @Test
    void getRandomQuestion() {
        out.add(QUESTION_1, ANSWER_1);
        assertEquals(FIRST_QUESTION_ANSWER, out.getRandomQuestion());

    }




}
