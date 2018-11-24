package com.quedu.fourteam.controller;

import com.quedu.fourteam.pojo.Goods;
import com.quedu.fourteam.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GoodsController {
    @Autowired
    private GoodsService service;

    @RequestMapping("/newGoods")
    public List<Goods> selectNewGoods(){

        return service.selectNewGoods();
    }

}
