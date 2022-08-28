package com.dejerzcode.entities;

public class Patient extends User{
    private String birthday;
    private double weight;
    private double height;
    private String bloodType;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return super.toString() + " Cumpleaños: " + this.getBirthday() + " Peso: " + this.getWeight() + " Altura " + this.getHeight() + " Tipo de Sangre: " + this.getBloodType();
    }
}
