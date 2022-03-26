package com.londonkoders.kwitter.kweet;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class KweetNotFoundHandler {
    @ResponseBody
    @ExceptionHandler(KweetNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFoundHandler(KweetNotFoundException ex) {
        return ex.getMessage();
    }
}
