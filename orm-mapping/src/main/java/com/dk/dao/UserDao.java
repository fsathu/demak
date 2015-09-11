package com.dk.dao;

import com.dk.model.User;
import com.dk.model.Vacancy;

/**
 * Created by fredrick on 8/18/15.
 */
public interface UserDao {
    public User findUserbyEmailandPassword(String email, String password);

    public void saveVacancy(Vacancy vacancy);

}
