package com.example.journallistfinaljavaweb.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FriendRequest {
    @NotBlank
    private String UserName;
}
