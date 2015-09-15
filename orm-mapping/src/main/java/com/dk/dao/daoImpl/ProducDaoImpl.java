package com.dk.dao.daoImpl;

import com.dk.dao.ProductDao;
import com.dk.model.Product;
import com.dk.util.HibernateUtil;
import org.hibernate.classic.Session;

/**
 * Created by fredrick on 9/15/15.
 */
public class ProducDaoImpl implements ProductDao {

    @Override
    public Product save(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
        return product;
    }
}
