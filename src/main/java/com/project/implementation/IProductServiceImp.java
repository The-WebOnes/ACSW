package com.project.implementation;

import com.project.DAOinterfaces.IProductDao;
import com.project.model.Product;
import com.project.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class IProductServiceImp implements IProductService {

    @Autowired
    private IProductDao iProductDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> ListProduct() {
        return (List<Product>) iProductDao.findAll();
    }

    @Override
    @Transactional
    public void saveProduct(Product product) {
        iProductDao.save(product);
    }

    @Override
    @Transactional
    public void deleteProduct(Product product) {
        iProductDao.delete(product);
    }


    @Override
    @Transactional(readOnly = true)
    public Product searchProduct(Product product) {
        return iProductDao.findById(product.getIdProduct()).orElse(null);
    }
}
