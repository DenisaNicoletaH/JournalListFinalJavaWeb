package com.example.journallistfinaljavaweb.responses;



import com.example.journallistfinaljavaweb.entity.Image;
import com.example.journallistfinaljavaweb.entity.Message;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ImageResponse {

    private String url;

/*
    @Valid
    private MessageResponse message;
*/
    public ImageResponse (Image image) {
            url = image.getUrl();
    }


}