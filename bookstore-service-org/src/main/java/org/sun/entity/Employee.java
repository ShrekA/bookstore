package org.sun.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Employee implements Serializable {
    /**
     * ID主键
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 员工编号
     */
    @Column(name = "E_CODE")
    private Integer eCode;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 年龄
     */
    @Column(name = "AGE")
    private Integer age;

    /**
     * 性别
     */
    @Column(name = "SEX")
    private String sex;

    /**
     * 工资
     */
    @Column(name = "SALARY")
    private Float salary;

    /**
     * 职位
     */
    @Column(name = "JOB_ID")
    private Integer jobId;

    /**
     * 手机号码
     */
    @Column(name = "PHONE_NUM")
    private String phoneNum;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private Date updateTime;

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
     * 获取员工编号
     *
     * @return E_CODE - 员工编号
     */
    public Integer geteCode() {
        return eCode;
    }

    /**
     * 设置员工编号
     *
     * @param eCode 员工编号
     */
    public void seteCode(Integer eCode) {
        this.eCode = eCode;
    }

    /**
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     *
     * @return AGE - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别
     *
     * @return SEX - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取工资
     *
     * @return SALARY - 工资
     */
    public Float getSalary() {
        return salary;
    }

    /**
     * 设置工资
     *
     * @param salary 工资
     */
    public void setSalary(Float salary) {
        this.salary = salary;
    }

    /**
     * 获取职位
     *
     * @return JOB_ID - 职位
     */
    public Integer getJobId() {
        return jobId;
    }

    /**
     * 设置职位
     *
     * @param jobId 职位
     */
    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    /**
     * 获取手机号码
     *
     * @return PHONE_NUM - 手机号码
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * 设置手机号码
     *
     * @param phoneNum 手机号码
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}