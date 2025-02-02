package com.notification.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail {

    private String orderId;

    private String email;

    private String userId;

    private String userPhone;

    private boolean orderPaymentStatus = false;

    private boolean orderStatus = false;

    private String courseId;

}
