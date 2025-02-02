package com.order.microservice.function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class NotifyService {

    @Bean
    public Consumer<String> consumeAck() {
        return (orderId) -> {
            updateOrder();
            System.out.println("Order with ID# : "+orderId+" sent to the user");
        };
    }

    private void updateOrder() {
        //Update order details in the database
        System.out.println("Order details updated in the database successfully");
    }
}
