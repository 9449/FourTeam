package com.quedu.fourteam.pojo;

import javax.persistence.*;

@Entity
@Table(name = "sort")
public class Sort {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//标记主键的生成策略 自增
    @Column(name = "sort_id")
    private Integer sortId;

    private String sortname;

    public Integer getSortId() {
        return sortId;
    }

    public void setSortId(Integer sortId) {
        this.sortId = sortId;
    }

    public String getSortname() {
        return sortname;
    }

    public void setSortname(String sortname) {
        this.sortname = sortname == null ? null : sortname.trim();
    }
}