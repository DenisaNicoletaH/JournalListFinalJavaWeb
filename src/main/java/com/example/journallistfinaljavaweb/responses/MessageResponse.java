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

private long id;
    //forced--> user needs to input message
    private String description;

    //might remove
    private ImageResponse image;

    private FriendResponse friend;

    public MessageResponse(Message message) {
        id = message.getId();
      description = message.getDescription();

      if(message.getImage() != null)
        image = new ImageResponse(message.getImage());

      if(message.getFriend()!=null)
      friend = new FriendResponse(message.getFriend());
    }





}
