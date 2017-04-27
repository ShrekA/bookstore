package org.sun.entity;

import javax.persistence.*;
import java.io.Serializable;

public class User implements Serializable {
    /**
     * ID主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工号
     */
    @Column(name = "E_CODE")
    private Integer eCode;

    /**
     * 账号
     */
    @Column(name = "ACCOUNT")
    private String account;

    /**
     * 密码
     */
    @Column(name = "PASSWD")
    private String passwd;

    /**
     * 状态:0未启用，1启用，2停用，3删除
     */
    @Column(name = "STATUS")
    private String status;

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
     * 获取员工号
     *
     * @return E_CODE - 员工号
     */
    public Integer geteCode() {
        return eCode;
    }

    /**
     * 设置员工号
     *
     * @param eCode 员工号
     */
    public void seteCode(Integer eCode) {
        this.eCode = eCode;
    }

    /**
     * 获取账号
     *
     * @return ACCOUNT - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取密码
     *
     * @return PASSWD - 密码
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * 设置密码
     *
     * @param passwd 密码
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * 获取状态:0未启用，1启用，2停用，3删除
     *
     * @return STATUS - 状态:0未启用，1启用，2停用，3删除
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态:0未启用，1启用，2停用，3删除
     *
     * @param status 状态:0未启用，1启用，2停用，3删除
     */
    public void setStatus(String status) {
        this.status = status;
    }
}