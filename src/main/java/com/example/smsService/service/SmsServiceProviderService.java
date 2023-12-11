package com.example.smsService.service;

import com.example.smsService.dto.MessageDTO;
import com.example.smsService.utils.helpers.ServiceProvider;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceProviderService {

       public MessageDTO.Response getServiceProvider(MessageDTO messageDTO) throws Exception {
           return new MessageDTO.Response(
                   messageDTO.getMessage(),
                   ServiceProvider.getServiceProviderForMobilePrefix(messageDTO.getMobileNumber()).name(),
                   messageDTO.getMobileNumber()
           );
       }
}
