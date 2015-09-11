package com.dk.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;
    private String password;
    private Boolean status;
    private PersonalDetails personalDetails;

    public User(String email,String password, Boolean status) {
        this.email =email;
        this.password = password;
        this.status = status;
    }

    public User() {

    }


    @Id
    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String string) {
        this.email = string;
    }
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "status", nullable = false)
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    @Cascade(value = CascadeType.ALL)
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }




}