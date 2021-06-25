package com.project.services;

import com.project.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> ListProduct();
    void saveProduct(Product product);
    void deleteProduct(Product product);
    Product searchProduct(Product product);
}