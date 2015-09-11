package com.dk.action;



import com.dk.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import serviceImpl.UserService;
import serviceImpl.UserServiceImpl;

/**
 * Created by fredrick on 8/18/15.
 */
public class LoginAction extends ActionSupport implements ModelDriven<User> {
    User user = new User();

    private UserService userService=new UserServiceImpl();
    public String loginAction(){
        System.out.println("Email= " + user.getEmail() + "password = " + user.getPassword());
        if (userService.findUserbyEmailandPassword(user.getEmail(), user.getPassword())!= null){
            return SUCCESS;
        }else{
            return ERROR;
        }


    }


    public User getModel() {
        return user;
    }
}
