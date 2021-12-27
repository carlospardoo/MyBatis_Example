package com.main;

import java.util.Set;

import com.conf.ClientService;
import com.model.Client;

public class ClientMain {
    public static void main(String[] args) {

        Client client = new Client(2, "David", "Pardo", 457);

        ClientService cs = new ClientService();

        /*boolean ins = cs.insertClient(client);

        if (ins) {
            System.out.println("Estoy insertado");
        } else {
            System.out.println("Fallo al insertar");
        }*/

        Set<Client> con = cs.getClients();
        for(Client cli : con){
            System.out.println(cli.toString());
        }

    }
}
