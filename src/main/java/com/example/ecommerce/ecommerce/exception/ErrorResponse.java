package com.example.ecommerce.ecommerce.exception;

import lombok.*;

import java.time.LocalDateTime;
@Getter@Setter@NoArgsConstructor@Builder@AllArgsConstructor
public class ErrorResponse {
    private  String message;
    private int status;
    private LocalDateTime timestamp;

    public ErrorResponse(int status, String message, LocalDateTime timestamp) {

        this.status = status;
        this.message  = message;
        this.timestamp = timestamp;
    }
}
