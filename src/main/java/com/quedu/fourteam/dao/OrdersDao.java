package com.quedu.fourteam.dao;

import com.quedu.fourteam.pojo.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersDao extends JpaRepository<Orders,Integer> {
}
