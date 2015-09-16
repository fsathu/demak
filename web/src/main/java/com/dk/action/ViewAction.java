package com.dk.action;

import com.dk.model.Product;
import com.opensymphony.xwork2.ActionSupport;
import serviceImpl.ProductService;
import serviceImpl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fredrick on 8/20/15.
 */
public class ViewAction extends ActionSupport {
    Product product=new Product();
    ProductService productService=new ProductServiceImpl();
    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    List<Product> productsList = new ArrayList<Product>();
    public String viewProducts(){
        productsList.addAll(productService.finAllProducts());
        return SUCCESS;
    }
    public String viewInvoice(){

        return SUCCESS;
    }
    public String viewHome(){

        return SUCCESS;
    }



}
