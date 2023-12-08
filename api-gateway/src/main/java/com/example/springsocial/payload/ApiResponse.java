package com.example.springsocial.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse {
    private boolean success;
    private String message;
    private String token;
    private String refreshToken;

    public ApiResponse(boolean success, String message, String token,String refreshToken) {
        this.success = success;
        this.message = message;
        this.token = token;
        this.refreshToken = refreshToken;
    }
}
