package org.sun.entity;

import javax.persistence.*;
import java.io.Serializable;

public class Department implements Serializable{
    /**
     * ID主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门编号
     */
    @Column(name = "CODE")
    private Integer code;

    /**
     * 上级部门
     */
    @Column(name = "P_ID")
    private Integer pId;

    /**
     * 部门主管
     */
    @Column(name = "M_ID")
    private Integer mId;

    /**
     * 部门电话
     */
    @Column(name = "TEL_PHONE")
    private String telPhone;

    /**
     * 每个月的部门运营费用
     */
    @Column(name = "OPERATINGCOSTS")
    private Float operatingcosts;

    /**
     * 获取ID主键
     *
     * @return ID - ID主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID主键
     *
     * @param id ID主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取部门编号
     *
     * @return CODE - 部门编号
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置部门编号
     *
     * @param code 部门编号
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取上级部门
     *
     * @return P_ID - 上级部门
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置上级部门
     *
     * @param pId 上级部门
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取部门主管
     *
     * @return M_ID - 部门主管
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * 设置部门主管
     *
     * @param mId 部门主管
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    /**
     * 获取部门电话
     *
     * @return TEL_PHONE - 部门电话
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * 设置部门电话
     *
     * @param telPhone 部门电话
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone;
    }

    /**
     * 获取每个月的部门运营费用
     *
     * @return OPERATINGCOSTS - 每个月的部门运营费用
     */
    public Float getOperatingcosts() {
        return operatingcosts;
    }

    /**
     * 设置每个月的部门运营费用
     *
     * @param operatingcosts 每个月的部门运营费用
     */
    public void setOperatingcosts(Float operatingcosts) {
        this.operatingcosts = operatingcosts;
    }
}