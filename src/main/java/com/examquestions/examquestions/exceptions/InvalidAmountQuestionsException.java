package com.examquestions.examquestions.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class InvalidAmountQuestionsException extends RuntimeException{

    public static String DEFAULT_MESSAGE = "Invalid amount of questions";

    public InvalidAmountQuestionsException() {
        this(DEFAULT_MESSAGE);
    }

    public InvalidAmountQuestionsException(String message) {
        super(message);
    }
}
