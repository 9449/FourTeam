package com.quedu.fourteam.service.impl;

import com.quedu.fourteam.dao.GoodsDao;
import com.quedu.fourteam.pojo.Goods;
import com.quedu.fourteam.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<Goods> selectNewGoods() {
        return goodsDao.selectNewGoods();
    }
}
