package com.model;

/**
 * 
 */
public class Client {
    /**
     * 
     */
    private int id;

    private String name;

    private String lastname;

    private int phone;

    public Client() {
        super();
    }

    public Client(int id, String name, String lastname, int phone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Client(String name, String lastname, int phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", lastname=" + lastname + ", name=" + name + ", phone=" + phone + "]";
    }

}
