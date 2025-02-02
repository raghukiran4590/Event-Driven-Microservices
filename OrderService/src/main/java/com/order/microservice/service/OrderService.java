package com.order.microservice.service;

import com.order.microservice.entity.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public OrderDetail createOrder() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId(UUID.randomUUID().toString());
        orderDetail.setEmail("vrihakiran@gmail.com");
        orderDetail.setUserPhone("999-777-9898");
        orderDetail.setUserId("123456");
        orderDetail.setCourseId(UUID.randomUUID().toString());

        //Usually these values come from the front end or other API calls
        //Save this order data to the database

        return orderDetail;
    }

}
