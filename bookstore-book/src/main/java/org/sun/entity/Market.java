package org.sun.entity;

import java.io.Serializable;

/**
 * Created by Mr.sun on 2017/4/18.
 */
public class Market implements Serializable {
    private Long id;
    /**
     * 编号
     */
    private String code;
    /**
     * 商场名称
     */
    private String name;

    /**
     * 商场地址
     */
    private String address;

    /**
     * 商场电话
     */
    private String telPhone;

    /**
     * 负责人
     */
    private String head;


}
