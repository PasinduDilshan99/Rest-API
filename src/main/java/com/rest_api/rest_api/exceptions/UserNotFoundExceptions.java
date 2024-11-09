package com.rest_api.rest_api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundExceptions extends RuntimeException{
    public UserNotFoundExceptions(String message) {
        super(message);
    }
}
