package com.example.journallistfinaljavaweb.responses;

import com.example.journallistfinaljavaweb.entity.Friend;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Optional;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FriendResponse {
    private long id;

    private String userName;

    public FriendResponse(Friend friend) {
        id = friend.getId();
        userName = friend.getUserName();

    }
}
