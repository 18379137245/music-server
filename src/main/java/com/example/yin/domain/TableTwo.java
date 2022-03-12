package com.example.yin.domain;


import javax.xml.crypto.Data;
import java.util.Date;

public class TableTwo {
    private String userid;

    private Date date;

    private String username;

    private String province;

    private String city;

    private String site;

    private String postcode;

    public TableTwo(String userid, Date date, String username, String province, String city, String site, String postcode) {
        this.userid = userid;
        this.date = date;
        this.username = username;
        this.province = province;
        this.city = city;
        this.site = site;
        this.postcode = postcode;
    }

    public TableTwo() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "TableTwo{" +
                "userid='" + userid + '\'' +
                ", date=" + date +
                ", username='" + username + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", site='" + site + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}

