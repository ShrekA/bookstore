package org.sun.entity;

/**
 * Created by Mr.sun on 2017/4/18.
 * 作者
 */
public class BookAuthor {

    private long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 作者邮箱
     */
    private String email;
    /**
     * 作者简介
     */
    private String summary;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
