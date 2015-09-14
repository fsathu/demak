package com.dk.dao;

import com.dk.model.User;

/**
 * Created by fredrick on 8/18/15.
 */
public interface UserDao {
    public User findUserbyEmailandPassword(String email, String password);



}
