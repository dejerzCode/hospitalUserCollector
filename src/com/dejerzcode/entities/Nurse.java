package com.dejerzcode.entities;

public class Nurse extends User{
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return super.toString() + " Especialidad: " + this.getSpeciality();
    }
}
