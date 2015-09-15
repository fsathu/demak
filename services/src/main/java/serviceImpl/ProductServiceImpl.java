package serviceImpl;

import com.dk.dao.ProductDao;
import com.dk.dao.daoImpl.ProducDaoImpl;
import com.dk.model.Product;
import com.dk.model.User;

/**
 * Created by fredrick on 9/15/15.
 */
public class ProductServiceImpl implements ProductService {
    ProductDao productDao=new ProducDaoImpl();

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }
}
