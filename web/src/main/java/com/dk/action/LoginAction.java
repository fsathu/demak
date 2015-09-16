package com.dk.action;


import com.dk.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.SessionAware;
import serviceImpl.UserService;
import serviceImpl.UserServiceImpl;

import java.util.Map;


public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware {

    User user = new User();
    private UserService userService = new UserServiceImpl();
    private Map<String, Object> sessionMap;


    public String loginAction() {

        if (userService.findUserbyEmailandPassword(user.getEmail(), user.getPassword()) != null) {
            sessionMap.put("email", user.getEmail());
            return SUCCESS;
        } else {
            addActionError("Please check Username and Password");
            return ERROR;
        }
    }

    public String logoutAction() {
        sessionMap.remove("email");
        return SUCCESS;
    }

    public String SignupAction() {

        return SUCCESS;
    }


    public User getModel() {
        return user;
    }


    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }
}
