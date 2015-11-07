package com.dk.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String email;
    private String password;
    private Boolean isActive;
    private String privilage;
    private PersonalDetails personalDetails;
    private Set<UserLoginDetails> userLoginDetails = new HashSet<UserLoginDetails>(0);


    public User(String email, String password, Boolean isActive, String privilage, PersonalDetails personalDetails) {
        this.email = email;
        this.password = password;
        this.isActive = isActive;
        this.privilage = privilage;
        this.personalDetails = personalDetails;
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

    @Column(name = "isActive", nullable = false)
        public Boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user")
    @Cascade(value = CascadeType.ALL)
    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
    @Column(name = "privilage", nullable = false)
    public String getPrivilage() {
        return privilage;
    }

    public void setPrivilage(String privilage) {
        this.privilage = privilage;
    }
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<UserLoginDetails> getUserLoginDetails() {
        return userLoginDetails;
    }

    public void setUserLoginDetails(Set<UserLoginDetails> userLoginDetails) {
        this.userLoginDetails = userLoginDetails;
    }
}