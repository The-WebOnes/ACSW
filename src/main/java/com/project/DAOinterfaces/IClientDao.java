package com.project.DAOinterfaces;

import com.project.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface IClientDao extends CrudRepository<Client,Long> { }
