package com.example.journallistfinaljavaweb.controller;

import com.example.journallistfinaljavaweb.entity.Message;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import com.example.journallistfinaljavaweb.responses.MessageResponse;
import com.example.journallistfinaljavaweb.service.MessageService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RequestMapping("/api/messages")
@CrossOrigin("*")
@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    //get

    //GETMAPPING
    @GetMapping()
    public List<MessageResponse> getAllMessages() {
        List<Message> messages = messageService.getAllMessage();
        List<MessageResponse> messageResponses = new ArrayList<>();

        messages.forEach(message -> {
            MessageResponse messageResponse = new MessageResponse(message);
            messageResponses.add(messageResponse);
        });

        return messageResponses;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponse addMessage(
            @Valid @RequestBody MessageRequest messageRequest
    ){

        Message savedMessage = messageService.addMessage(messageRequest);

        return new MessageResponse(savedMessage);

    }




}
