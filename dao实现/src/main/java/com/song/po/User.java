package com.song.po;

import java.util.Date;

/** 
* @author ���� E-mail: Sugare
* @version ����ʱ�䣺2017��12��3�� ����4:59:21 
* @description ˵����User��Ӧ���ݿ���е��ֶ�
*/
public class User {
    private Integer id;

    private String username;

    private Date birthday;

    private String sex;

    private String address;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}