package com.example.journallistfinaljavaweb.service;


import com.example.journallistfinaljavaweb.entity.Message;
//import com.example.jpahello.repository.CourseRepository;
import com.example.journallistfinaljavaweb.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;
    public List<Message> getAllMessage(){
            return(List<Message>) messageRepository.findAll();
    }
}
