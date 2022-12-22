package com.example.journallistfinaljavaweb.service;

import com.example.journallistfinaljavaweb.entity.Message;
import com.example.journallistfinaljavaweb.entity.User;
import com.example.journallistfinaljavaweb.exception.ResourceNotFoundException;
import com.example.journallistfinaljavaweb.repository.MessageRepository;
import com.example.journallistfinaljavaweb.repository.UserRepository;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import com.example.journallistfinaljavaweb.request.UserRequest;
import com.example.journallistfinaljavaweb.responses.MessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
/*
    @Autowired
    UserRepository userRepository;

    @Autowired
    MessageRepository messageRepository;


    //-------
    public Message addMessage(long user_id, MessageRequest messageRequest){
        User user = userRepository.findById(user_id).orElseThrow(()-> new ResourceNotFoundException("user id is not found"));

        Message messageSaved = new Message(messageRequest);

        //Change recheck---------------------------
        messageSaved.setMessage(String.valueOf(user));
        return  messageRepository.save(messageSaved);

        }
        //--------------------------------------------------

        //Get all messages ---------->recheck
    //Change the variable "messagesX"--->findMessages
    //Uses id to find messages
        public List<Message> getAllMessages(long user_Id){
        return messageRepository.findAllById(user_Id);
    }

    public void deleteAllMessages(long user_Id){
        if(userRepository.existsById(user_Id)){
            messageRepository.deleteAllById(user_Id);
        }
        else {
            throw new ResourceNotFoundException("user Id is not found");
        }

        }

        //gets all the users by using firstName--->if its null or its blank -->return all list of user
        public List<User> getAllUsers(String firstNameParameter){
        if(firstNameParameter == null || firstNameParameter.isBlank())
            return(List<User>) userRepository.findAll();

        return userRepository.findAllByFirst_nameIgnoreCase(firstNameParameter);
    }

    public User addUser(UserRequest userRequest){
        User user =new User(userRequest);
        return userRepository.save(user);

    }

    /*
    public User userUpdate(long userId,UserRequest userRequest){
        userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User id is not found"));

        User userToBeUpdate  = new User(userRequest);
        userToBeUpdate

     */

        }






