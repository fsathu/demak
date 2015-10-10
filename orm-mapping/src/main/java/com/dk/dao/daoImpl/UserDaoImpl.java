package com.dk.dao.daoImpl;


import com.dk.dao.UserDao;
import com.dk.model.User;
import com.dk.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 * Created by fredrick on 8/18/15.
 */
public class UserDaoImpl implements UserDao {

    public User findUserbyEmailandPassword(String email, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = (User) session.createCriteria(User.class)
                .add(Restrictions.eq("email", email)).
                        add(Restrictions.eq("password", password)).
                        uniqueResult();
        session.getTransaction().commit();
        return user;
   /**/
    }

    @Override
    public User save(User user) {
        org.hibernate.Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return user;
    }


}
