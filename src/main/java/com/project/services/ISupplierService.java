package com.project.services;

import com.project.model.Supplier;
import java.util.List;

public interface ISupplierService {
    List<Supplier> ListSupplier();
    void saveSupplier(Supplier supplier);
    void deleteSupplier(Supplier supplier);
    Supplier searchSupplier(Supplier supplier);
}
