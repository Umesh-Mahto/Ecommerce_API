package com.geekster.Ecommerce.API.controller;

import com.geekster.Ecommerce.API.model.ProductModel;
import com.geekster.Ecommerce.API.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController { 
    @Autowired
    private ProductService productService;

    @GetMapping(value = "/getAllProduct/{productCategory}")
    public List<ProductModel> getAllProduct(@PathVariable String productCategory){
        return productService.getAllProductNow(productCategory);
    }
    @PostMapping(value = "/addProduct")
    public String addProduct(@RequestBody ProductModel product){
        return productService.saveProduct(product);
    }
    @DeleteMapping(value = "deleteProduct/{productId}")
    public String deleteProduct(@PathVariable int productId){
        return productService.deleteProductNow(productId);
    }
}
