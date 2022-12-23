package com.example.journallistfinaljavaweb.entity;

import com.example.journallistfinaljavaweb.request.ImageRequest;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="image")
@Getter
@Setter
@NoArgsConstructor
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "imageUrl")
    private String url;



    //One image can have one message
    public Image(ImageRequest imageRequest)
    {
        url = imageRequest.getUrl();

    }




}