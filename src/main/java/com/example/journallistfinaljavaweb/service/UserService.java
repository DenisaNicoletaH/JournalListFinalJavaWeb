package com.example.journallistfinaljavaweb.service;

import com.example.journallistfinaljavaweb.entity.Message;
import com.example.journallistfinaljavaweb.entity.User;
import com.example.journallistfinaljavaweb.exception.ResourceNotFoundException;
import com.example.journallistfinaljavaweb.repository.MessageRepository;
import com.example.journallistfinaljavaweb.repository.UserRepository;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUser(Long user_id){
        return null;
                /*.orElseThrow(()->new ResourceNotFoundException("user id is not found"));

         Message messageTobeSaved = new Message(messageRequest);
         messageTobeSaved.setDescription(user_id);

         return

                 */

    }
}

