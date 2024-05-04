package com.learnavro.controller;

import com.learnavro.dto.CoffeeOrderDTO;
import com.learnavro.service.CoffeeOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/coffee_orders")
@Slf4j
public class CoffeeOrderController {

    private CoffeeOrderService coffeeOrderService;

    public CoffeeOrderController(CoffeeOrderService coffeeOrderService) {
        this.coffeeOrderService = coffeeOrderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CoffeeOrderDTO newOrder(@RequestBody CoffeeOrderDTO coffeeOrderDTO){
        log.info("Received the requested for an order: {}", coffeeOrderDTO);
        return coffeeOrderService.newOrder(coffeeOrderDTO);
    }


}
