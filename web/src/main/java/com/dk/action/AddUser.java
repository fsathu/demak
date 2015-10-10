package com.dk.action;

import com.dk.model.PersonalDetails;
import com.dk.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import serviceImpl.UserService;
import serviceImpl.UserServiceImpl;

/**
 * Created by fredrick on 10/10/15.
 */
public class AddUser extends ActionSupport implements ModelDriven<User> {
   User user= new User();
    PersonalDetails personalDetails=new PersonalDetails();
    UserService userService= new UserServiceImpl();
    private String first_name;
    private String last_name;
    private String age;
    private String gender;
private boolean isActive=false;
    public String AddUser(){
        if(user != null) {
personalDetails.setFirst_name(personalDetails.getFirst_name());
personalDetails.setLast_name(personalDetails.getLast_name());
personalDetails.setAge(personalDetails.getAge());
personalDetails.setGender(personalDetails.getGender());

            personalDetails.setUser(user);
user.setIsActive(user.getIsActive());
            userService.save(user);
            return SUCCESS;
        }
        return ERROR;
    }

    @Override
    public User getModel() {
        return user;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
