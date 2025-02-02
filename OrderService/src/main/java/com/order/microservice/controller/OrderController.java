package com.order.microservice.controller;

import com.order.microservice.entity.OrderDetail;
import com.order.microservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

  /*  @PostMapping
    public ResponseEntity<?> createOrder() {
        return ResponseEntity.ok("Order Created");
    }*/

    @GetMapping
    public ResponseEntity<?> getOrder() {
        return ResponseEntity.ok("Order Received");
    }

    @PostMapping
    public ResponseEntity<?> createOrder() {
        OrderDetail order = orderService.createOrder();
        orderCreatedNotification(order);
        return ResponseEntity.ok("Order Created");
    }

    @Autowired
    private StreamBridge streamBridge;

    private void orderCreatedNotification(OrderDetail orderDetail) {
        //logic to send notification to the notification service

        boolean send = streamBridge.send("orderCreatedEvent-out-0", orderDetail);

        if (send) {
            System.out.println("Order event is successfully sent to the notification service");
        } else {
            System.out.println("Order event failed");
        }
    }

}
