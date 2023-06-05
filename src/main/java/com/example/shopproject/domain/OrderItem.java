package com.example.shopproject.domain;

import com.example.shopproject.domain.item.Item;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class OrderItem {
    @Id @GeneratedValue
    @Column(name="order_item_id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    private int orderPrice;
    private int count;
}
