package com.example.shopproject.domain;

import lombok.Data;

@Data
public class OrderSearch {
    private String memberName;
    private OrderStatus orderStatus;
}
