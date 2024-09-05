package com.poo.banco.entities;

import java.time.LocalDateTime;
import java.util.Date;

public class Account {
    public static int counterId = 1;
    public static int counterNumber = 1000;

    private int id;
    private String number;
    private Agency agency;
    private Client owner;
    private Date openingDate;
    private String type;
    private double balance;
    private char classfication;
    private String status;

    public Account(String type, Client owner, String number, int id, double balance,
                   Date openingDate, char classfication, String status) {
        this.type = type;
        this.owner = owner;
        this.number = (counterNumber + "-0");
        counterNumber++;
        this.id = counterId;
        counterId++;
        this.balance = balance;
        this.openingDate = openingDate;
        this.classfication = classfication;
        this.status = status;
    }

    public Account(){
        this.id = counterId;
        counterId ++;

        this.number = (counterNumber + "-0");
        counterNumber++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public char getClassfication() {
        return classfication;
    }

    public void setClassfication(char classfication) {
        this.classfication = classfication;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void showBalance(){
        System.out.println("Account: " + this.number);
        System.out.println("Owner: " + this.owner.getName());
        System.out.println("Balance: $" + this.balance);
    }

    public void showAccountData(){
        System.out.println("Account: " + this.number);
        System.out.println("Owner: " + this.owner.getName());
        System.out.println("Balance: $" + this.balance);
        System.out.println("Opening date: " + this.openingDate);
        System.out.println("Type: " + this.type);
        System.out.println("Classification: " + this.classfication);
        System.out.println("Status: " + this.status);
    }

    public boolean deposit(double value) {
        if (value > 0) {
            this.balance += value;
            System.out.println("Deposit made successfully!");
            return true;
        } else {
            System.out.println("Invalid value for deposit.");
            return false;
        }
    }

}
