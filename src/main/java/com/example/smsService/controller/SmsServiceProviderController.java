package com.example.smsService.controller;

import com.example.smsService.dto.MessageDTO;
import com.example.smsService.service.SmsServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class SmsServiceProviderController {

    @Autowired
    private SmsServiceProviderService smsServiceProviderService;

    @PostMapping
    public ResponseEntity<MessageDTO.Response> getServiceProviderWithMessage(@RequestBody MessageDTO messageDTO) throws Exception {
        return ResponseEntity.ok().body(smsServiceProviderService.getServiceProvider(messageDTO));
    }
}
