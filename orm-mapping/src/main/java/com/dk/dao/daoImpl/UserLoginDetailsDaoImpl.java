package com.dk.dao.daoImpl;

import com.dk.dao.UserLoginDetailsDao;
import com.dk.model.UserLoginDetails;
import com.dk.util.HibernateUtil;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by fredrick on 9/20/15.
 */
public class UserLoginDetailsDaoImpl implements UserLoginDetailsDao {
    @Override
    public UserLoginDetails save(UserLoginDetails userLoginDetails) {
        org.hibernate.classic.Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(userLoginDetails);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return userLoginDetails;


    }
    public UserLoginDetails update(UserLoginDetails userLoginDetails) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(userLoginDetails);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return userLoginDetails;
    }

    @Override
    public UserLoginDetails findLoginDetailByUserAndmaxId(String email,Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            UserLoginDetails userLoginDetails = (UserLoginDetails)session.createCriteria(UserLoginDetails.class)
.createAlias("user","user")
                    .add(Restrictions.eq("user.email", email)).
                            add(Restrictions.eq("id",id)).
                            uniqueResult();
            session.getTransaction().commit();
            return userLoginDetails;

    }

    @Override
    public List<UserLoginDetails> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        List<UserLoginDetails> result = session.createCriteria(UserLoginDetails.class)
                .list();
        session.getTransaction().commit();
        return result;
    }

}
