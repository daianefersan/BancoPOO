package com.poo.banco.entities;

import java.util.Date;

public class Attendant extends Person{
    private Agency agency;
    private String registration;
    private double salary;

    public Attendant(int id, String name, String cpf, Date birthDate, String login,
                     String password, Adress adress, String mail,
                     String telephoneNumber,
                     Agency agency, String registration, double salary) {

        super(id, name, cpf, birthDate, login, password, adress, mail, telephoneNumber);
        this.agency = agency;
        this.registration = registration;
        this.salary = salary;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
