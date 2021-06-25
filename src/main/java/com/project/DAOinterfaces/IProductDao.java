package com.project.DAOinterfaces;

import com.project.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductDao extends CrudRepository<Product,Long> { }
