package com.example.journallistfinaljavaweb.entity;

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

    //the id might be removed
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;



    @Column(nullable = false)
    private String description;

    @Column(nullable = true)
    private String image;


    public Message(MessageRequest messageRequest){
        description=messageRequest.getDescription();
        image=messageRequest.getImage();
    }




}

