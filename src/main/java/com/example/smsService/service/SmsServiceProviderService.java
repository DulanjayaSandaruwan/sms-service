package com.example.smsService.service;

import com.example.smsService.dto.MessageDTO;
import com.example.smsService.utils.helpers.ServiceProvider;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceProviderService {

       public MessageDTO.Response getServiceProvider(MessageDTO messageDTO) throws Exception {
           String serviceProvider = ServiceProvider.getServiceProviderForMobilePrefix(messageDTO.getMobileNumber()).name();
           System.out.println("Service : " + serviceProvider + " Message : " + messageDTO.getMessage());
           return new MessageDTO.Response(
                   "message sent",
                   messageDTO.getMobileNumber()
           );
       }
}
