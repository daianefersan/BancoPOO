package com.poo.banco.entities;

public class Agency {
    public static int counterId = 0;
    public static int counterNumber = 100;
    private int id;
    private String name;
    private String number;
    private Manager generalManager;
    private String telefone;
    private Adress adress;

    public Agency(int id, String name, String number, Manager generalManager, String telefone, Adress adress) {
        this.id = counterId;
        counterId++;
        this.name = name;
        this.number = ("0" + counterNumber);
        counterNumber++;
        this.generalManager = generalManager;
        this.telefone = telefone;
        this.adress = adress;
    }

    public Agency(){
        this.id = counterId;
        counterId++;
        this.number = (counterNumber + "-0");
        counterNumber++;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Manager getGeneralManager() {
        return generalManager;
    }

    public void setGeneralManager(Manager generalManager) {
        this.generalManager = generalManager;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void doubleSalary(){
        if (this.generalManager != null) {
            this.generalManager.doubleSalary();
        } else {
            System.out.println("General Manager is undefined for this agency.");
        }
    }
}
