package com.mapper;

import java.util.Set;

import com.model.Client;

public interface ClientMapper {

    public void insertClient(Client client);

    public Set<Client> selectClients();
}
