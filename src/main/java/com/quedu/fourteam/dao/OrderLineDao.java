package com.quedu.fourteam.dao;

import com.quedu.fourteam.pojo.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineDao extends JpaRepository<OrderLine,Integer> {
}
