package com.project.implementation;

import com.project.DAOinterfaces.IClientDao;
import com.project.model.Client;
import com.project.services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class IClientServiceImp implements IClientService {
    @Autowired
    private IClientDao iClientDao;

    @Override
    @Transactional(readOnly = true)
    public List<Client> ListClient() {
        return (List<Client>) iClientDao.findAll();
    }

    @Override
    @Transactional
    public void saveClient(Client client) {
        iClientDao.save(client);
    }

    @Override
    @Transactional
    public void deleteClient(Client client) {
        iClientDao.delete(client);
    }

    @Override
    @Transactional(readOnly = true)
    public Client searchClient(Client client) {
        return iClientDao.findById(client.getIdClient()).orElse(null);
    }

}
