package com.notification.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {

    @GetMapping
    public ResponseEntity<?> getNotifications() {
        return ResponseEntity.ok("Notifications Sent");
    }
}
