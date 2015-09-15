package com.dk.dao.daoImpl;

import com.dk.dao.ProductDao;
import com.dk.model.Product;
import com.dk.util.HibernateUtil;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

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

    @Override
    public List<Product> findAllProducts(){

        Session session = HibernateUtil.getSessionFactory().openSession();

            session.beginTransaction();
            List<Product> result = session.createCriteria(Product.class)
                    .list();
            session.getTransaction().commit();
            return result;



    }

    @Override
    public Product findProductbyBarcode(String barcode) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
       Product result = (Product) session.createCriteria(Product.class).

               add(Restrictions.eq("barcode",barcode)).uniqueResult();

        session.getTransaction().commit();
        return result;

    }
}
