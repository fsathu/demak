package com.dk.action;


import com.dk.model.User;
import com.dk.model.UserLoginDetails;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.SessionAware;
import serviceImpl.UserLoginDetailsService;
import serviceImpl.UserLoginDetailsServiceImpl;
import serviceImpl.UserService;
import serviceImpl.UserServiceImpl;

import java.util.Date;
import java.util.Map;


public class LoginAction extends ActionSupport implements ModelDriven<User>, SessionAware {

    User user = new User();
    UserLoginDetails userLoginDetails = new UserLoginDetails();
    UserLoginDetailsService userLoginDetailsService = new UserLoginDetailsServiceImpl();
    private UserService userService = new UserServiceImpl();
    private Map<String, Object> sessionMap;
    private String USER_ROLE;


    public String loginAction() {
        /*if (userService.findUserbyEmailandPassword(user.getEmail(), user.getPassword()) != null) {*/
            user = userService.findUserbyEmailandPassword(user.getEmail(), user.getPassword());
            sessionMap.put("userType", user.getPrivilage());
            sessionMap.put("email", user.getEmail());
            userLoginDetails.setUser(user);
            userLoginDetails.setLoginDateAndTime(new Date());
            userLoginDetailsService.save(userLoginDetails);
            sessionMap.put("loginid", userLoginDetails.getId());
            return SUCCESS;
       /* } else {*/
          /*  addActionError("Please check Username and Password");
            return ERROR;
        }*/
    }

    public String logoutAction() {
        String email= (String) sessionMap.get("email");
        Long LoginId= (Long) sessionMap.get("loginid");
        userLoginDetails=userLoginDetailsService.findLoginDetailByUserAndmaxId(email,LoginId);
        userLoginDetails.setLogotDateAndTime(new Date());
        userLoginDetails.setUser(userLoginDetails.getUser());

        userLoginDetailsService.update(userLoginDetails);

        sessionMap.remove("email");
        sessionMap.remove("userType");
        return SUCCESS;
    }

    public String SignupAction() {
        return SUCCESS;
    }


    public User getModel() {
        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public String getUSER_ROLE() {
        return USER_ROLE;
    }

    public void setUSER_ROLE(String USER_ROLE) {
        this.USER_ROLE = USER_ROLE;
    }


    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }
}
