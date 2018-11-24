package com.quedu.fourteam.pojo;

import javax.persistence.*;

@Entity
@Table(name = "order_line")
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略 自增
    @Column(name = "ol_id")
    private Integer olId;
    @Column(name = "order_id")
    private Integer orderId;
    @Column(name = "good_id")
    private Integer goodId;

    private Integer count;

    public Integer getOlId() {
        return olId;
    }

    public void setOlId(Integer olId) {
        this.olId = olId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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