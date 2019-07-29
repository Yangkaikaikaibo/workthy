package com.tx.pojo;

import java.util.Date;

public class record {
    private Integer id;

    private String name;

    private String stucode;

    private Date createdate;

    private String createby;

    private String des;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStucode() {
        return stucode;
    }

    public void setStucode(String stucode) {
        this.stucode = stucode == null ? null : stucode.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public record(Integer id, String name, String stucode, Date createdate, String createby, String des) {
        this.id = id;
        this.name = name;
        this.stucode = stucode;
        this.createdate = createdate;
        this.createby = createby;
        this.des = des;
    }

    public record(String name, String stucode, Date createdate, String createby, String des) {
        this.name = name;
        this.stucode = stucode;
        this.createdate = createdate;
        this.createby = createby;
        this.des = des;
    }

    public record() {
    	super();
    }
}