package com.service;

import java.util.List;

import com.conf.MyBatisUtil;
import com.mapper.ClientMapper;
import com.model.Client;

import org.apache.ibatis.session.SqlSession;

public class ClientService {

    public ClientService() {
        super();
    }

    public boolean insertClient(Client client){
        boolean hasInsert = false;
        SqlSession session = new MyBatisUtil().getSession();
        if(session != null){
            try{
                ClientMapper clientMapper = session.getMapper(ClientMapper.class);
                clientMapper.insertClient(client);
                session.commit();
                hasInsert = true;
            }
            finally{
                session.close();
            }
        }
        else{
            System.out.println("Error starting session");
        }
        return hasInsert;
    }

    public List<Client> getClients(){
        List<Client> clients = null; //new HashSet<>()
        SqlSession session = new MyBatisUtil().getSession();
        if(session != null){
            try{
                ClientMapper clientMapper = session.getMapper(ClientMapper.class);
                clients = clientMapper.selectClients();
                session.commit();
            }
            finally{
                session.close();
            }
        }
        else{
            System.out.println("Error starting session");
        }
        return clients;
    }
}
