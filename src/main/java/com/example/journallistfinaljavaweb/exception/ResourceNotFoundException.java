package com.example.journallistfinaljavaweb.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

//recheck
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(){
        super("Resource not found");
    }
    public ResourceNotFoundException(String message){
        super(message);
    }

}