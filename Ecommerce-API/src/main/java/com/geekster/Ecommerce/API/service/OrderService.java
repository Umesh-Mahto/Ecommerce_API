package com.geekster.Ecommerce.API.service;

import com.geekster.Ecommerce.API.model.OrderModel;
import com.geekster.Ecommerce.API.model.ProductModel;
import com.geekster.Ecommerce.API.model.UserModel;
import com.geekster.Ecommerce.API.repository.IOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private IOrderRepository orderRepository;

    public String productOrder(OrderModel orderModel) {

        orderRepository.save(orderModel);

        return "Orderd Successfull!";
    }

    public ProductModel getProductByOrderIdtNow(int orderId) {
        Optional<OrderModel> OptionalObj = orderRepository.findById(orderId);
        ProductModel productObj =OptionalObj.get().getProductModel();
        return productObj;
    }

    public UserModel getByUserIdNow(int userId) {
        Optional<OrderModel> OptionalObj = orderRepository.findById(userId);
        UserModel userObj =OptionalObj.get().getUserModel();
        return userObj;
    }


}