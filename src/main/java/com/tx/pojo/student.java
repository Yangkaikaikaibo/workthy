package com.tx.pojo;

import java.util.Date;

public class student {
    private Integer id;

    private String code;

    private String name;

    private Integer major;

    private String grade;

    private Integer sex;

    private Date brthday;

    private Integer tel;

    private Integer job;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getMajor() {
        return major;
    }

    public void setMajor(Integer major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBrthday() {
        return brthday;
    }

    public void setBrthday(Date brthday) {
        this.brthday = brthday;
    }

    public Integer getTel() {
        return tel;
    }

    public void setTel(Integer tel) {
        this.tel = tel;
    }

    public Integer getJob() {
        return job;
    }

    public void setJob(Integer job) {
        this.job = job;
    }

    public student(Integer id, String code, String name, Integer major, String grade, Integer sex, Date brthday, Integer tel, Integer job) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.sex = sex;
        this.brthday = brthday;
        this.tel = tel;
        this.job = job;
    }

    public student(String code, String name, Integer major, String grade, Integer sex, Date brthday, Integer tel, Integer job) {
        this.code = code;
        this.name = name;
        this.major = major;
        this.grade = grade;
        this.sex = sex;
        this.brthday = brthday;
        this.tel = tel;
        this.job = job;
    }

    public student() {
    	super();
    }
}