package com.poo.banco.entities;

import java.util.Date;

public class SavingsAccount extends Account{
    public SavingsAccount(String type, Client owner, String number, int id, double balance,
                          Date openingDate, char classfication, String status) {
        super(type, owner, number, id, balance, openingDate, classfication, status);
    }

    @Override
    public void showAccountData() {
        System.out.println("Savings account: \n");
        super.showAccountData();
    }

    @Override
    public boolean deposit(double value) {
        return super.deposit(value);
    }

    @Override
    public void showBalance() {
        System.out.println("Savings account balance: \n");
        super.showBalance();
    }

    public double perfomance(double newBalance){
        setBalance(getBalance() * 0.5);
        newBalance = getBalance();
        return newBalance;
    }

    public boolean withdraw(double value){
        if (getBalance() >= value){
            setBalance(getBalance() - value);
            System.out.println("Withdraw has been realized! ");
            return true;
        }else {
            System.out.println("Insufficient balance to withdraw");
            return false;
        }
    }
}
