package com.example.smsService.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MessageDTO {
       private String mobileNumber;
       private String message;

       @Setter
       @AllArgsConstructor
       @NoArgsConstructor
       @Getter
       public static class Response {
              private  String message;
              private  String serviceProvider;
              private  String mobileNumber;
       }
}
