package com.quedu.fourteam.pojo;

import javax.persistence.*;

@Entity
@Table(name = "shop_good")
public class ShopGood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略 自增
    @Column(name = "sg_id")
    private Integer sgId;
    @Column(name = "shop_id")
    private Integer shopId;
    @Column(name = "good_id")
    private Integer goodId;

    private Integer count;

    public Integer getSgId() {
        return sgId;
    }

    public void setSgId(Integer sgId) {
        this.sgId = sgId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}