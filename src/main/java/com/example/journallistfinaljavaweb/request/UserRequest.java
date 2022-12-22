package com.example.journallistfinaljavaweb.request;


import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserRequest {


    @NotNull
    @NotBlank
    private long id;

    //cannot be Null,cannot be Blank
    @NotNull
    @NotBlank
    private String firstName;


    //can be null and blank-->not obligatory
    private String lastName;

/*
    //the user will request a message which cannot be blank,null and needs to be (valid?)
    //recheck
    @NotBlank
    @NotNull
    @Valid
    private MessageRequest messageRequest;

 */



}
