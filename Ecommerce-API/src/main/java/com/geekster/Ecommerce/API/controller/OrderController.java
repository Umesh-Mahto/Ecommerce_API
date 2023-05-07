package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.OrderModel;
import com.geekster.Ecommerce.API.model.ProductModel;
import com.geekster.Ecommerce.API.model.UserModel;
import com.geekster.Ecommerce.API.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping(value = "/post")
    public String order(@RequestBody OrderModel orderModel){

        return orderService.productOrder(orderModel);
    }
    @GetMapping(value = "/getProductByOrderId/{orderId}")
    public ProductModel getProductByOrderId(@PathVariable int orderId){
        return orderService.getProductByOrderIdtNow(orderId);
    }

    @GetMapping(value = "/getByUserId/{userId}")
    public UserModel getByUserId(@PathVariable int userId){
        return orderService.getByUserIdNow(userId);
    }


}
