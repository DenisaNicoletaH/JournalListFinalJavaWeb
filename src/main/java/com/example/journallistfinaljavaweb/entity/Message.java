package com.example.journallistfinaljavaweb.entity;

import com.example.journallistfinaljavaweb.request.ImageRequest;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="messages")
@Getter
@Setter
@NoArgsConstructor

public class Message {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String description;

    //One message can have many url images
    @OneToOne(cascade=CascadeType.ALL)
    private Image image;


    //Takes this
    public Message(MessageRequest messageRequest){

        description=messageRequest.getMessage();
        image = new Image(messageRequest.getImage());
    }




}

