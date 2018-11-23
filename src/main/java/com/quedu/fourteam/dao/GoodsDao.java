package com.quedu.fourteam.dao;

import com.quedu.fourteam.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoodsDao extends JpaRepository<Goods,Integer> {
}
