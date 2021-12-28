package com.mapper;

import java.util.List;

import com.model.Client;

public interface ClientMapper {

    public void insertClient(Client client);

    public List<Client> selectClients();
}
