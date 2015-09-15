package com.dk.action;

import com.dk.model.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.interceptor.SessionAware;
import serviceImpl.ProductService;
import serviceImpl.ProductServiceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by fredrick on 9/14/15.
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>,SessionAware{
    private Map sessionMap = ActionContext.getContext().getSession();
    Product product=new Product();
    ProductService productService=new ProductServiceImpl();

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    List<Product> productsList = new ArrayList<Product>();

    public String addProduct(){

        if(productService.findProductbyBarcode(product.getBarcode())== null){
            product.setExpiryDate(new Date());
            product.setLastUpdateDate(new Date());
            product.setLastUpdatedby((String) sessionMap.get("email"));
            productService.save(product);
            productsList.addAll(productService.finAllProducts());
            addActionMessage("Product has been Successfully Added");
            return SUCCESS;
        }else{
            addActionError("Product Already Exist");
            return ERROR;
        }


    }


    @Override
    public Product getModel() {
        return product;
    }




    @Override
    public void setSession(Map<String, Object> sessionMap) {
        this.sessionMap=sessionMap;
    }
}
