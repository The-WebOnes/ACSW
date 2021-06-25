package com.project.services;

import com.project.model.Client;
import java.util.List;

public interface IClientService {
    List<Client> ListClient();
    void saveClient(Client client);
    void deleteClient(Client client);
    Client searchClient(Client client);
}
