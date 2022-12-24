package com.example.journallistfinaljavaweb.service;


import com.example.journallistfinaljavaweb.entity.Message;
//import com.example.jpahello.repository.CourseRepository;
import com.example.journallistfinaljavaweb.exception.ResourceNotFoundException;
import com.example.journallistfinaljavaweb.repository.MessageRepository;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;
    public List<Message> getAllMessage(){
            return(List<Message>) messageRepository.findAll();
    }




    public void deleteMessage(long messageId){
        if(messageRepository.existsById(messageId)){
messageRepository.deleteById(messageId);
        }
        else{
            throw new ResourceNotFoundException("message id is not found");
        }
    }


}
