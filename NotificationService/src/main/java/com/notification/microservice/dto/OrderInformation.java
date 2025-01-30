package com.notification.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderInformation {

    private String orderID;

    private String userEmail;

    private String userPhone;

    private Date createdDate;

    private String price;

}
