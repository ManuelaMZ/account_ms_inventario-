package com.misionticmanu.Account_ms_M.models;

import org.springframework.data.annotation.Id;
import java.awt.font.FontRenderContext;
import java.util.Date;
import java.util.List;

public class Sells {
    @Id
    private String username;
    private String id_sale;
    private Date date;
    private String id_product;
    private Integer amount;
    private String WayToPay;




    public Sells(String id_sale, Date date, String id_product, Integer amount, String WayToPay , String username) {
        this.id_sale = id_sale;
        this.date = date;
        this.id_product = id_product;
        this.amount = amount;
        this.WayToPay = WayToPay;
        this.username = username;

    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getId_sale() {
        return id_sale;
    }

    public void setId_sale(String id_sale) {
        this.id_sale = id_sale;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getId_product() {
        return id_product;
    }

    public void setId_product(String id_product) {
        this.id_product = id_product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getWayToPay() {
        return WayToPay;
    }

    public void setWayToPay(String wayToPay) {
        WayToPay = wayToPay;
    }

}
