package serviceImpl;

import com.dk.model.Product;
import com.dk.model.User;

import java.util.Collection;
import java.util.List;

/**
 * Created by fredrick on 9/15/15.
 */
public interface ProductService {
    public Product save(Product product);
    List<Product> finAllProducts();

    public Product findProductbyBarcode(String barcode);
}
