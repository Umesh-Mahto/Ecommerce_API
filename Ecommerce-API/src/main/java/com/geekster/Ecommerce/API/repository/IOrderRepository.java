package com.geekster.Ecommerce.API.repository;

import com.geekster.Ecommerce.API.model.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends CrudRepository<OrderModel , Integer> {

}