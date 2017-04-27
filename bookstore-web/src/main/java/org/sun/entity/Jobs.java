package org.sun.entity;

import java.io.Serializable;

/**
 * Created by Mr.sun on 2017/4/18.
 * 职位
 */
public class Jobs implements Serializable {
    private long id;
    /**
     * 职位名称
     */
    private String name;
    /**
     * 职位描述
     */
    private String desc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
