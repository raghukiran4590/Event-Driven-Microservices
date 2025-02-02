package com.order.microservice.entity;

import lombok.*;

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
