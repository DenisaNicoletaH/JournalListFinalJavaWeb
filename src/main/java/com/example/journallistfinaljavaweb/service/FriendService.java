package com.example.journallistfinaljavaweb.service;

import com.example.journallistfinaljavaweb.entity.Friend;
import com.example.journallistfinaljavaweb.entity.Message;
import com.example.journallistfinaljavaweb.exception.ResourceNotFoundException;
import com.example.journallistfinaljavaweb.repository.FriendRepository;
import com.example.journallistfinaljavaweb.repository.MessageRepository;
import com.example.journallistfinaljavaweb.request.FriendRequest;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import com.example.journallistfinaljavaweb.responses.FriendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class FriendService {

    @Autowired
    FriendRepository friendRepository;

    @Autowired
    MessageRepository messageRepository;



    public Friend getFriendById(long id){
        Friend friend = friendRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Friend Id not found"));

        return friend;
    }

    public Friend addFriend(FriendRequest friendRequest)
    {
        Friend friend = new Friend(friendRequest);

        return friendRepository.save(friend);
    }

    public List<Message> getAllMessages(long friendId){
        return messageRepository.findAllByFriendId(friendId);
    }

    public List<Friend> getAllFriends(){
        return (List<Friend>) friendRepository.findAll();
    }

    public Message addMessage(long friendId, MessageRequest messageRequest){
        Friend friend =  friendRepository.findById(friendId).orElseThrow(
                ()->new ResourceNotFoundException("friend id is not found"));

        Message messageToBeSaved = new Message(messageRequest);
        messageToBeSaved.setFriend(friend);

        return  messageRepository.save(messageToBeSaved);
    }

    public void deleteFriend(long friendId){
        if(friendRepository.existsById(friendId)) {
            friendRepository.deleteById(friendId);
        }
        else {
            throw new ResourceNotFoundException("friend id not found");
        }


    }
    //delete message without deleting the friend
    public void deleteAllMessages(long friendId){
        if(friendRepository.existsById(friendId)) {
            messageRepository.deleteAllByFriendId(friendId);
        }
        else {
            throw new ResourceNotFoundException("friend id not found");
        }
    }

    public Friend updateFriend(long friendId, @RequestBody FriendRequest friendRequest){
        if (friendRepository.existsById(friendId))
        {
            Friend friendtoBeUpdated=new Friend(friendRequest);
            friendtoBeUpdated.setId(friendId);
            return friendRepository.save(friendtoBeUpdated);
        }
        else{
            throw new ResourceNotFoundException("message id not found");
        }

    }
}
