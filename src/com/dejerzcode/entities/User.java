package com.dejerzcode.entities;

public abstract class User {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.getClass().toString() + " ID: " + this.getId() + " Nombre: " + this.getName() +" Dirección: " + this.getAddress() + " Teléfono: " + this.getPhoneNumber();
    }
}
