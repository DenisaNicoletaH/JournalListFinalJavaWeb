package com.example.journallistfinaljavaweb.entity;

import com.example.journallistfinaljavaweb.request.FriendRequest;
import com.example.journallistfinaljavaweb.request.ImageRequest;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="friends")
@Getter
@Setter
@NoArgsConstructor
public class Friend {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    private String userName;



    //One image can have one message
    public Friend(FriendRequest friendRequest)
    {
        userName = friendRequest.getUserName();
    }




}