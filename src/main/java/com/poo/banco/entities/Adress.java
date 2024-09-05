package com.poo.banco.entities;

public class Adress {
    public static int counterId = 0;

    private int id;
    private String publicPlace;
    private int number;
    private String complement;
    private String city;
    private String state;
    private String zipCode;

    public Adress(int id, String publicPlace, int number, String complement, String city,
                  String state, String zipCode) {

        this.id = counterId;
        counterId ++;
        this.publicPlace = publicPlace;
        this.number = number;
        this.complement = complement;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Adress(){
        this.id = counterId;
        counterId ++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Public Place: " + publicPlace + "\n" +
                "Number: " + number +"\n"+
                "Complement: '" + complement + "\n" +
                "City: " + city + "\n" +
                "State: " + state + "\n" +
                "Zip code: " + zipCode;
    }
}
