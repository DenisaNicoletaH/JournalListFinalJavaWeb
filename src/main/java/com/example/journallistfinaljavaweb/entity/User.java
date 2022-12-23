package com.example.journallistfinaljavaweb.entity;

import com.example.journallistfinaljavaweb.request.MessageRequest;
import com.example.journallistfinaljavaweb.request.UserRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="user_table")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    public User(UserRequest userRequest) {
        //firstName=messageRequest.getMessage();
        //lastName=messageRequest.getMessage();
        firstName = userRequest.getFirstName();
        lastName = userRequest.getLastName();
        //image=messageRequest.getImage();
    }
}