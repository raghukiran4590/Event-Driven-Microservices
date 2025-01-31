package com.notification.microservice.dto;

import lombok.*;

import java.util.Date;

@Data
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
