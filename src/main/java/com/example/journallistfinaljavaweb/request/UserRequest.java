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

public class UserRequest {


    private long id;

    @NotBlank
    private  String firstName;

    private String lastName;


}
