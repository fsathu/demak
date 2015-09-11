package com.dk.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by fredrick on 8/20/15.
 */
@Entity
@Table(name = "vacancy")
public class Vacancy implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ref_no")
    private  String reference_no;
    @Column(name = "create_date")
    private Date createdate;
    @Column(name = "opening_date")
    private String openingdate;
    @Column(name = "closing_date")
    private String closingdate;
    @Column(name = "company")
    private String company;
    @Column(name = "designation")
    private String designation;
    @Column(name = "qty")
    private Long qty;
    @Column(name = "description")
    private String description;

    public Vacancy() {
        this.reference_no = reference_no;
        this.createdate = createdate;
        this.openingdate = openingdate;
        this.closingdate = closingdate;
        this.company = company;
        this.designation = designation;
        this.qty = qty;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference_no() {
        return reference_no;
    }

    public void setReference_no(String reference_no) {
        this.reference_no = reference_no;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getOpeningdate() {
        return openingdate;
    }

    public void setOpeningdate(String openingdate) {
        this.openingdate = openingdate;
    }

    public String getClosingdate() {
        return closingdate;
    }

    public void setClosingdate(String closingdate) {
        this.closingdate = closingdate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    }
