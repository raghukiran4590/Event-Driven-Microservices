package com.notification.microservice.function;

import com.notification.microservice.dto.OrderDetail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class OrderNotificationFunctions {

    @Bean
    public Function<OrderDetail, String> orderEventReceiver() {
        return (orderDetail -> {
            //process order event
            System.out.println("Sending notification to user");
            sendEmailAndMessagetoUser(orderDetail.getEmail(), orderDetail.getUserPhone());
            return orderDetail.getOrderId();
        });
    }

    private void sendEmailAndMessagetoUser(String email, String userPhone) {
        System.out.println("Sending email to "+email);
        System.out.println("Sending SMS to "+userPhone);
        System.out.println("Order notification sent to user");
        System.out.println("----------------------------------");

    }
}
