package com.example.journallistfinaljavaweb.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="messsages")


//Need User(for messages)-->maybe change?????, Need Message(Cannot be nullable), Need Image(can be nullable)
//May need to add the Time since it tells the user the time they have submitted a message

public class User {

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //name
    @Column(name="firstName" , nullable = false)
    private String first_name;

    @Column(name="lastName" , nullable = true)
    private String last_name;


    /*
    //1 person can have many messages
    @OneToMany(cascade= CascadeType.ALL, optional=false)
    private User message;

     */
}
