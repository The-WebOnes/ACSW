package com.project.implementation;

import com.project.DAOinterfaces.ISupplierDao;
import com.project.model.Supplier;
import com.project.services.ISupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ISupplierServiceImp implements ISupplierService {

    @Autowired
    private ISupplierDao iSupplierDao;

    @Override
    @Transactional(readOnly = true)
    public List<Supplier> ListSupplier() {
        return (List<Supplier>) iSupplierDao.findAll();
    }

    @Override
    @Transactional
    public void saveSupplier(Supplier supplier) {
        iSupplierDao.save(supplier);
    }

    @Override
    @Transactional
    public void deleteSupplier(Supplier supplier) {
        iSupplierDao.delete(supplier);
    }

    @Override
    @Transactional(readOnly = true)
    public Supplier searchSupplier(Supplier supplier) {
        return iSupplierDao.findById(supplier.getIdSupplier()).orElse(null);
    }
}
