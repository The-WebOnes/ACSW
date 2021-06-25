package com.project.DAOinterfaces;

import com.project.model.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface ISupplierDao extends CrudRepository<Supplier,Long> { }
