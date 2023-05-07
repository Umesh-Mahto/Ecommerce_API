package com.geekster.Ecommerce.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class OrderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    // private  int userId; //(foreign key mapping)
    // private int productId; //(foreign key mapping)
    //private int addressId; //(foreign key mapping)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_user")
    private UserModel userModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_product")
    private ProductModel productModel;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "foreign_address")
    private AddressModel addressModel;
    private int productQuantity;

}