package com.quedu.fourteam.pojo;

import javax.persistence.*;

@Entity
@Table(name = "shopcar")
public class Shopcar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略 自增
    @Column(name = "car_id")
    private Integer carId;
    @Column(name = "user_id")
    private Integer userId;

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}