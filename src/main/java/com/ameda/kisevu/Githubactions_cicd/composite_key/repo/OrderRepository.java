package com.ameda.kisevu.Githubactions_cicd.composite_key.repo;/*
*
@author ameda
@project Githubactions-cicd
*
*/

import com.ameda.kisevu.Githubactions_cicd.composite_key.entity.Order;
import com.ameda.kisevu.Githubactions_cicd.composite_key.entity.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<Order, OrderId> {


//    @Modifying
//    @Query("update Order o set o.numOfOrders=: numOfOrders where o.orderId=: orderId")
//    Order updateOrder(Integer numOfOrders, OrderId orderId);
}
