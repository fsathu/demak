package com.dk.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="personal_details")
public class PersonalDetails implements Serializable {


    private static final long serialVersionUID = 1L;

    private String email;
    private User user;
    private String first_name;
    private String last_name;
    private String age;
    private String gender;
    private String userType;

    public PersonalDetails(){

    }

    public PersonalDetails(User user,String first_name,String last_name,String age,
                           String gender,String userType
    ){
        this.setUser(user);
        this.first_name=first_name;
        this.last_name=last_name;
        this.age=age;
        this.gender=gender;
        this.userType=userType;

    }

    @Id
    @Column(name = "email", unique = true, nullable = false)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Column(name = "first_name", unique = false, nullable = false)
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    @Column(name = "last_name", unique = false, nullable = false)
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    @Column(name = "age", unique = false, nullable = false)
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    @Column(name = "gender", unique = false, nullable = false)
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Column(name = "user_type", unique = false, nullable = false)
    public String getUserType() {
        return userType;
    }
    public void setUserType(String userType) {
        this.userType = userType;
    }
    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}