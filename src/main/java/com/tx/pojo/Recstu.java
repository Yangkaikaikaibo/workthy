package com.tx.pojo;

import java.util.Date;

/**
 * @author lhl
 * @create 2019-07-28 16:10
 */
public class Recstu {
    private Integer id;//编号
    private String name;//奖惩
    private String stuname;//学生姓名
    private String createby;//创建人
    private Date createData;//创建时间
    private String des;//描述

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
        this.name = name;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getCreateData() {
        return createData;
    }

    public void setCreateData(Date createData) {
        this.createData = createData;
    }

    public Recstu(Integer id, String name, String stuname, String createby, Date createData, String des) {
        this.id = id;
        this.name = name;
        this.stuname = stuname;
        this.createby = createby;
        this.createData = createData;
        this.des = des;
    }

    public Recstu(String name, String stuname, String createby, Date createData, String des) {
        this.name = name;
        this.stuname = stuname;
        this.createby = createby;
        this.createData = createData;
        this.des = des;
    }

    public Recstu() {
    	super();
    }
}
