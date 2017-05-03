package org.sun.entity;

import java.io.Serializable;

/**
 * Created by Mr.sun on 2017/4/18.
 * 书本实体
 */
public class Book implements Serializable {

    private Long id;
    private String code;
    /**
     * 书名
     */
    private String name;
    /**
     * 作者
     */
    private long authorId;
    /**
     * 规格
     */
    private String specification;
    /**
     * 零售价格
     */
    private float retailrice;
    /**
     * 批发价
     */
    private float tradePrice;
    /**
     * 采购成本
     */
    private float purchasePrice;

    /**
     * 出版商
     */
    private long pCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public float getRetailrice() {
        return retailrice;
    }

    public void setRetailrice(float retailrice) {
        this.retailrice = retailrice;
    }

    public float getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(float tradePrice) {
        this.tradePrice = tradePrice;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public long getpCode() {
        return pCode;
    }

    public void setpCode(long pCode) {
        this.pCode = pCode;
    }
}
