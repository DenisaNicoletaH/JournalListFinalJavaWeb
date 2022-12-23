package com.example.journallistfinaljavaweb.service;

import com.example.journallistfinaljavaweb.entity.Message;
import com.example.journallistfinaljavaweb.entity.Image;
import com.example.journallistfinaljavaweb.exception.ResourceNotFoundException;
import com.example.journallistfinaljavaweb.repository.MessageRepository;
import com.example.journallistfinaljavaweb.repository.ImageRepository;
import com.example.journallistfinaljavaweb.request.MessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

/*
    @Autowired
    private ImageRepository imageRepository;

    public Image getImage(long imageId) {
        Image image = imageRepository.findById(imageId).orElseThrow(() -> new ResourceNotFoundException("image id not found"));
        return image;
    }

 */
}