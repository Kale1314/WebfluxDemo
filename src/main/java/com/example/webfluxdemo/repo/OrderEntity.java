package com.example.webfluxdemo.repo;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("t_order")
public class OrderEntity {
    private String id;
}
