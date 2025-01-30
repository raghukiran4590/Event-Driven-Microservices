package com.order.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @PostMapping
    public ResponseEntity<?> createOrder() {
            return ResponseEntity.ok("Order Created");
    }

    @GetMapping
    public ResponseEntity<?> getOrder() {
        return ResponseEntity.ok("Order Received");
    }
}
