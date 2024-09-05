package com.poo.banco.entities;

import java.util.Date;

public class Manager extends Person{
    private String registration;
    private Date promotionDate;
    private double salary;


    public Manager(int id, String name, String cpf, Date birthDate, String login, String password, Adress adress, String mail, String telephoneNumber,
                   String registration, Date promotionDate, double salary) {

        super(id, name, cpf, birthDate, login, password, adress, mail, telephoneNumber);
        this.registration = registration;
        this.promotionDate = promotionDate;
        this.salary = salary;

    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public Date getPromotionDate() {
        return promotionDate;
    }

    public void setPromotionDate(Date promotionDate) {
        this.promotionDate = promotionDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void doubleSalary() {
        this.salary *= 2;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "registration='" + registration + '\'' +
                ", promotionDate=" + promotionDate +
                ", salary=" + salary +
                ", adress=" + adress +
                '}';
    }
}
