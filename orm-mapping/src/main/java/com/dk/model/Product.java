package com.dk.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by fredrick on 9/14/15.
 */
@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id", unique = true, nullable = false)
    private  Long id;
    @Column(name = "product_name",nullable = false)
    private String productName;
    @Column(name = "barcode",unique = true,nullable = false)
    private String barcode;
    @Column(name = "selling_price",nullable = false)
    private double sellingPrice;
    @Column(name = "buying_price",nullable = false)
    private double buyingPrice;
    @Column(name = "qty",nullable = false)
    private double qty;
    @Column(name = "expiry_date")
    private Date expiryDate;
    @Column(name = "last_update_date")
    private Date lastUpdateDate;
    @Column(name = "last_update_by")
    private String lastUpdatedby;

    public Product(String productName, String barcode, double sellingPrice, double buyingPrice, double qty, Date expiryDate, Date lastUpdateDate, String lastUpdatedby) {
        this.id=id;
        this.productName = productName;
        this.barcode = barcode;
        this.sellingPrice = sellingPrice;
        this.buyingPrice = buyingPrice;
        this.qty = qty;
        this.expiryDate = expiryDate;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedby = lastUpdatedby;
    }

    public Product() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getLastUpdatedby() {
        return lastUpdatedby;
    }

    public void setLastUpdatedby(String lastUpdatedby) {
        this.lastUpdatedby = lastUpdatedby;
    }
}
