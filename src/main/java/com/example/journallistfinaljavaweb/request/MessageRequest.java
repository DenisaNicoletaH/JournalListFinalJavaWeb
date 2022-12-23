package com.example.journallistfinaljavaweb.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

   // private String image;

  //  private String firstName;
  @NotNull
  @Valid
  private ImageRequest image;


}
