package com.ameda.kisevu.Githubactions_cicd.composite_key.entity;/*
*
@author ameda
@project Githubactions-cicd
*
*/


import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "_order")
public class Order {
    @EmbeddedId
    private OrderId id;
    private String orderInfo;
    private int numberOfOrders;
    @Embedded
    private Address address;
}
