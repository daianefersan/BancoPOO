package com.poo.banco.entities;

import java.util.Date;

public class Person {
    public static int counterId = 1;
    private int id;
    private String name;
    private String cpf;
    private Date birthDate;
    private String login;
    private String password;
    Adress adress;
    private String mail;
    private String telephoneNumber;

    public Person(int id, String name, String cpf, Date birthDate, String login,
                  String password, Adress adress, String mail, String telephoneNumber) {

        this.id = counterId;
        counterId ++;
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.login = login;
        this.password = password;
        this.adress = adress;
        this.mail = mail;
        this.telephoneNumber = telephoneNumber;
    }

    public Person(){
        this.id = counterId;
        counterId++;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

}
