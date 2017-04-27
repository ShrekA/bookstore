package org.sun.entity;

/**
 * Created by Mr.sun on 2017/4/18.
 */
public class Department {

    private long id;
    /**
     * 部门号
     */
    private String code;

    /**
     * 部门主管
     */
    private long mId;
    /**
     * 部门电话
     */
    private String telPhone;
    /**
     * 每个月的部门运营费用
     */
    private String operatingCosts;
    /**
     * 上级部门
     */
    private long pId;

}
