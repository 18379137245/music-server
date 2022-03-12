package com.example.yin.domain;

import java.io.Serializable;

//实体层
public class Product implements Serializable {
    //商品名称
    private int product_id;
    //商品英文名称
    private String product_ename;
    //商品中文名称
    private String product_cname;
    //商品数量
    private String product_quantity;
    //借书日期
    private String borrow_date;
    //还书日期
    private String return_date;

    private String product_owner;

    public Product() {
    }

    public Product(int product_id, String product_ename, String product_cname, String product_quantity, String borrow_date, String return_date, String product_owner) {
        this.product_id = product_id;
        this.product_ename = product_ename;
        this.product_cname = product_cname;
        this.product_quantity = product_quantity;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
        this.product_owner = product_owner;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_ename() {
        return product_ename;
    }

    public void setProduct_ename(String product_ename) {
        this.product_ename = product_ename;
    }

    public String getProduct_cname() {
        return product_cname;
    }

    public void setProduct_cname(String product_cname) {
        this.product_cname = product_cname;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getProduct_owner() {
        return product_owner;
    }

    public void setProduct_owner(String product_owner) {
        this.product_owner = product_owner;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_ename='" + product_ename + '\'' +
                ", product_cname='" + product_cname + '\'' +
                ", product_quantity='" + product_quantity + '\'' +
                ", borrow_date='" + borrow_date + '\'' +
                ", return_date='" + return_date + '\'' +
                ", product_owner='" + product_owner + '\'' +
                '}';
    }
}
