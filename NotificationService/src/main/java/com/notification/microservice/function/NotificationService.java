package com.notification.microservice.function;

import com.notification.microservice.dto.OrderInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class NotificationService {

    @Bean
    public Supplier<String> testFunction() {
       return () -> "This is test function";
    }

    @Bean
    public Function<String, String> sayHello() {
        return (message) -> "Hello, how are you doing? "+message;
    }

    @Bean
    public Function<OrderInformation, String> orderNotification() {

        return (orderInformation -> {
            send(orderInformation);
            System.out.println(orderInformation.getUserEmail());
            System.out.println(orderInformation.getUserPhone());
            System.out.println(orderInformation.getPrice());
            System.out.println(orderInformation.getCreatedDate());
            return orderInformation.getUserPhone();
        });
    }

    private void send(OrderInformation orderInformation) {

    }
}
