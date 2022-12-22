package com.example.journallistfinaljavaweb.entity;

import com.example.journallistfinaljavaweb.request.UserRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.internal.util.logging.Messages;

import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="user")


//Need User(for messages)-->maybe change?????, Need Message(Cannot be nullable), Need Image(can be nullable)
//May need to add the Time since it tells the user the time they have submitted a message

public class User {

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //name
    @Column( nullable = false)
    private String firstName;

    @Column(nullable = true)
    private String lastName;


    //1 person can have many messages(messages are a list)
@OneToMany
private List<Message> messages;


//many messages can have one person
    public User(UserRequest userRequest){

        firstName=userRequest.getFirstName();
        lastName=userRequest.getLastName();

    }
}
