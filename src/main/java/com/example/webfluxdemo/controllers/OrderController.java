package com.example.webfluxdemo.controllers;

import com.example.webfluxdemo.repo.OrderEntity;
import com.example.webfluxdemo.repo.OrderRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/order")
@Validated
@RequiredArgsConstructor
public class OrderController {

    private final OrderRepo repo;
    @GetMapping("/paging")
    public Mono<Page<OrderEntity>> paging(OrderEntity params,Pageable pageable){
        return repo.findBy(Example.of(params),reactiveFluentQuery -> reactiveFluentQuery.page(pageable));
    }

}
