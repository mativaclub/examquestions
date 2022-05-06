package com.examquestions.examquestions;

import com.examquestions.examquestions.exceptions.InvalidAmountQuestionsException;
import com.examquestions.examquestions.service.QuestionService;
import com.examquestions.examquestions.service.impl.ExaminerServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static com.examquestions.examquestions.ConstantsTest.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {


    @InjectMocks
    private ExaminerServiceImpl out;
    @Mock
    public QuestionService questionService;

    public ExaminerServiceImplTest(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Test
    void shouldGetAllQuestions() {
        when(questionService.getAll()).thenReturn(QUESTION_SET);
        when(questionService.getRandomQuestion()).thenReturn(FIRST_QUESTION_ANSWER);
        assertEquals(questionService.getAll(), out.getQuestions(1));
    }

    @Test
    void shouldThrowExceptionWhenNumberOfQuestionsExceeded() {
        when(questionService.getAll()).thenReturn(Set.of(FIRST_QUESTION_ANSWER));
        assertThrows(InvalidAmountQuestionsException.class,() ->out.getQuestions(3));
    }

}
