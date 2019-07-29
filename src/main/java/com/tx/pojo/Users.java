package com.tx.pojo;

public class Users {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Users(Integer id, String username, String password, String realname) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.realname = realname;
    }

    public Users(String username, String password, String realname) {
        this.username = username;
        this.password = password;
        this.realname = realname;
    }

    public Users() {
    	super();
    }
}