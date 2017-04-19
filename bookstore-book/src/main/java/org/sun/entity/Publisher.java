package org.sun.entity;

import java.io.Serializable;

/**
 * Created by Mr.sun on 2017/4/18.
 * 出版商实体
 */
public class Publisher implements Serializable {
    private long id;
    /**
     * 编码
     */
    private String code;
    /**
     * 出版商名称
     */
    private String name;
    /**
     * 出版商联系电话
     */
    private String phone;
    /**
     * 出版商地址
     */
    private String address;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
