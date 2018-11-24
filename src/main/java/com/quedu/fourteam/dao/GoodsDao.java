package com.quedu.fourteam.dao;

import com.quedu.fourteam.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsDao extends JpaRepository<Goods,Integer> {

    @Query(value = "select g.*,s.sortname as sortname from goods as g,`sort` as s where g.sort_id=s.sort_id ORDER BY good_id DESC limit 0,5",nativeQuery = true)
    public List<Goods> selectNewGoods();
}
