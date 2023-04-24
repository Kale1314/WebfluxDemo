package com.example.webfluxdemo.repo;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends R2dbcRepository<OrderEntity,String> {
}
