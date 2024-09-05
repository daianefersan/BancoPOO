package com.poo.banco.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client extends Person{
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public Client(int id, String name, String cpf, Date birthDate, String login,
                  String password, Adress adress, String mail, String telephoneNumber) {
        super(id, name, cpf, birthDate, login, password, adress, mail, telephoneNumber);
    }

    public void showRecord(){
        System.out.println(getName());
        System.out.println(getCpf());
        System.out.println(getBirthDate());
        System.out.println(getLogin());
        System.out.println(getPassword());
        System.out.println(getMail());
        System.out.println(getTelephoneNumber());
        System.out.println(getId());
    }
}
