package com.examquestions.examquestions;

import com.examquestions.examquestions.model.Question;

import java.util.Collection;
import java.util.Set;

public class ConstantsTest {

    public static final String QUESTION_1 = "Question one";
    public static final String QUESTION_2 = "Question two";
    public static final String QUESTION_3 = "Question tree";

    public static final String ANSWER_1 = "Answer one";
    public static final String ANSWER_2 = "Answer two";
    public static final String ANSWER_3 = "Answer tree";

    public static final String INVALID_NUMBER_OF_QUESTIONS = "invalidNumberOfQuestions";

    public static final Question FIRST_QUESTION_ANSWER = new Question(QUESTION_1, ANSWER_1);
    public static final Question SECOND_QUESTION_ANSWER = new Question(QUESTION_2, ANSWER_2);
    public static final Question THIRD_QUESTION_ANSWER = new Question(QUESTION_3, ANSWER_3);

    public static final Set<Question> QUESTION_SET = Set.of(FIRST_QUESTION_ANSWER, SECOND_QUESTION_ANSWER, THIRD_QUESTION_ANSWER);
    public static final Collection<Question> QUESTIONS_1 = Set.of(FIRST_QUESTION_ANSWER);


}
