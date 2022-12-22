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
/*
    @Column(name="firstName",nullable = false)
    private String firstName;

    @Column(name="lastName")
    private String lastName;
*/
    @Column(nullable = false)
    private String description;
/*
    @Column()
    private String image;
*/
    //many messages have 1 person
    /*
@ManyToOne
private User user;

*/



    //Takes this
    public Message(MessageRequest messageRequest){
        //firstName=messageRequest.getMessage();
        //lastName=messageRequest.getMessage();
        description=messageRequest.getMessage();
        //image=messageRequest.getImage();
    }




}

