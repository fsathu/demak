package com.dk.dao;

import com.dk.model.Product;

import java.util.List;

/**
 * Created by fredrick on 9/15/15.
 */
public interface ProductDao {

    public Product save(Product product);

    List<Product> findAllProducts();

    public Product findProductbyBarcode(String barcode);

}
