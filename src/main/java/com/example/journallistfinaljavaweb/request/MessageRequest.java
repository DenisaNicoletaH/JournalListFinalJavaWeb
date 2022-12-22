package com.example.journallistfinaljavaweb.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class MessageRequest {


    @NotBlank
    private String message;

    private String image;

    private String firstName;



}
