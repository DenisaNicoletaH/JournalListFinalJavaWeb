package com.example.journallistfinaljavaweb.responses;

import com.example.journallistfinaljavaweb.entity.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageResponse {

    //might change this later
   // private String first_name;


    //forced--> user needs to input message
    private String description;

    //might remove
    //private String image;

    public MessageResponse(Message message) {
      description = message.getDescription();
    }





}
