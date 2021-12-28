package com.main;

import java.util.List;

import com.model.Client;
import com.service.ClientService;

public class ClientMain {
    public static void main(String[] args) {

        //Client client = new Client(2, "David", "Pardo", 457);

        ClientService cs = new ClientService();

        /*boolean ins = cs.insertClient(client);

        if (ins) {
            System.out.println("Estoy insertado");
        } else {
            System.out.println("Fallo al insertar");
        }*/

        List<Client> con = cs.getClients();
        for(Client cli : con){
            System.out.println(cli.toString());
        }

    }
}
