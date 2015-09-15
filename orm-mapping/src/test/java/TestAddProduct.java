import com.dk.dao.ProductDao;
import com.dk.dao.daoImpl.ProducDaoImpl;
import com.dk.model.Product;

import java.util.Date;

/**
 * Created by fredrick on 9/15/15.
 */
public class TestAddProduct {
    public static void main(String[] args) {

        ProductDao productDao=new ProducDaoImpl();
        Product product = new Product();

        product.setProductName("Coca Cola");
        product.setBarcode("10008998167");
        product.setExpiryDate(new Date());
        product.setBuyingPrice(35.00);
        product.setSellingPrice(50.00);
        product.setQty(20);
        product.setLastUpdateDate(new Date());
        product.setLastUpdatedby("admin");

        productDao.save(product);

    }
}
