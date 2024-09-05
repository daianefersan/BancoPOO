package com.poo.banco.entities;

import java.util.Date;

public class SalaryAccount extends Account{
    public SalaryAccount(String type, Client owner, String number, int id, double balance,
                         Date openingDate, char classfication, String status) {
        super(type, owner, number, id, balance, openingDate, classfication, status);
    }

    @Override
    public void showAccountData() {
        super.showAccountData();
    }

    @Override
    public boolean deposit(double value) {
        return super.deposit(value);
    }

    @Override
    public void showBalance() {
        System.out.println("Salary account balance: \n");
        super.showBalance();
    }
}
