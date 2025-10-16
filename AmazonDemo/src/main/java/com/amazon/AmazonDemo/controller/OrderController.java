package com.amazon.AmazonDemo.controller;

import com.amazon.AmazonDemo.model.PurchseOrder;
import com.amazon.AmazonDemo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService service;

    @GetMapping
    public List<PurchseOrder> getAllOders(){
        return service.getAllOrders();
    }
    @PostMapping
    public String createOrder (@RequestBody PurchseOrder order){
        service.createOrder(order);
        return "create successfully";
    }


    @DeleteMapping("/{id}")
    public String deleteOrder(@PathVariable int id){
        return service.deleteOrder(id);
    }
}
