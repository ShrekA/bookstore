package org.sun.entity;

import java.io.Serializable;

/**
 * Created by Mr.sun on 2017/4/18.
 * 仓库
 */
public class Warehouse implements Serializable {
    private long id;
    /**
     * 仓库号
     */
    private String code;
    /**
     * 仓库管理者
     */
    private long mId;

    /**
     * 仓库电话
     */
    private String telPhone;

    /**
     * 运营成本
     */
    private String operatingCosts;
}
