package com.poo.banco.entities;

import java.util.Date;

public class CurrentAccount extends Account{
    public CurrentAccount(String type, Client owner, String number, int id, double balance,
                          Date openingDate, char classfication, String status) {

        super(type, owner, number, id, balance, openingDate, classfication, status);
    }

    public CurrentAccount() {
        this.setId(counterId);
        counterId ++;

        this.setNumber(counterNumber + "-0");
        counterNumber++;
    }

    @Override
    public void showAccountData() {
        System.out.println("Current account: \n");
        super.showAccountData();
    }

    @Override
    public void showBalance() {
        System.out.println("Current account balance: \n");
        super.showBalance();
    }

    public boolean transfer(Account destinationAccount, double value){
        if (getBalance()>= value){
            setBalance(getBalance() - value);
            destinationAccount.deposit(value);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deposit(double value) {
        return super.deposit(value);
    }

}
