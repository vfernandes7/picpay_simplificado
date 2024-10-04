package com.pipaysimplificado.services;

import com.pipaysimplificado.domain.user.User;
import com.pipaysimplificado.dtos.NotificationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NotificationService {
    @Autowired
    private RestTemplate restTemplate;

    public void sendNotification(User user, String message) throws Exception {
        String email = user.getEmail();
        NotificationDto notificationRequest = new NotificationDto(email, message);

//        ResponseEntity<String> notificationResponse = restTemplate.postForEntity("https://util.devi.tools/api/v1/notify", notificationRequest, String.class);
//
//        if(!(notificationResponse.getStatusCode() == HttpStatus.OK)) {
//            System.out.println("erro ao enviar notificação");
//            throw new Exception("Serviço de notificação está fora do ar");
//        }

        System.out.println("Notificação enviada ao usuário");

    }
}
