package serviceImpl;

import com.dk.dao.ProductDao;
import com.dk.dao.daoImpl.ProducDaoImpl;
import com.dk.model.Product;

import java.util.List;

/**
 * Created by fredrick on 9/15/15.
 */
public class ProductServiceImpl implements ProductService {
    ProductDao productDao=new ProducDaoImpl();

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> finAllProducts() {
        return productDao.findAllProducts();
    }

    @Override
    public Product findProductbyBarcode(String barcode) {
        return productDao.findProductbyBarcode(barcode);
    }
}
