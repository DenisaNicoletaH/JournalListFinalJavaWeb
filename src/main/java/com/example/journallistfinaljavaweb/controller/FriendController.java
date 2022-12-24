package com.example.journallistfinaljavaweb.controller;


import com.example.journallistfinaljavaweb.entity.Friend;
import com.example.journallistfinaljavaweb.entity.Message;
import com.example.journallistfinaljavaweb.repository.FriendRepository;
import com.example.journallistfinaljavaweb.request.FriendRequest;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import com.example.journallistfinaljavaweb.responses.FriendResponse;
import com.example.journallistfinaljavaweb.responses.MessageResponse;
import com.example.journallistfinaljavaweb.service.FriendService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/api/friends")
@CrossOrigin("*")
@RestController
public class FriendController {

    @Autowired
    FriendService friendService;

    @GetMapping("/{friendId}/messages")
    public List<MessageResponse> getAllMessages(@PathVariable long friendId){
        List<Message> courses = friendService.getAllMessages(friendId);
        List<MessageResponse> messageResponses = new ArrayList<>();
        for(int i=0; i < courses.size(); i++){
            messageResponses.add(new MessageResponse(courses.get(i)));
        }

        return messageResponses;
    }

    @GetMapping()
    public List<FriendResponse> getAllFriends(){

        List<Friend> teachers = friendService.getAllFriends();
        List<FriendResponse> friendResponses = new ArrayList<>();
        teachers.forEach(friend -> {
            FriendResponse friendResponse = new FriendResponse(friend);
            friendResponses.add(friendResponse);
        });
        return friendResponses;
    }
    @GetMapping("/{friendId}")
    public FriendResponse getCourse(@PathVariable long friendId) {
        return new FriendResponse(friendService.getFriendById(friendId));
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{friendId}/messages")
    public MessageResponse addMessage(
            @PathVariable long friendId,
            @Valid @RequestBody MessageRequest messageRequest
    ){
        return new MessageResponse(friendService.addMessage(friendId, messageRequest));
    }


    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public FriendResponse addFriend(@Valid @RequestBody FriendRequest friendRequest)
    {

        Friend savedFriend = friendService.addFriend(friendRequest);

        return new FriendResponse(savedFriend);

    }

    @DeleteMapping("{friendId}/messages")
    public void deleteAllMessage(@PathVariable long friendId){
        friendService.deleteAllMessages(friendId);

    }

    @PutMapping("/{friendId}")
    public FriendResponse updateMessage(@PathVariable long friendId,
                                         @Valid  @RequestBody FriendRequest friendRequest){
        return new FriendResponse(friendService.updateFriend(friendId,friendRequest));
    }






}
