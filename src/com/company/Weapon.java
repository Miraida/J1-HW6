package com.company;

public class Weapon {
    private String nameOfGun;
    private String typeOfGun;
    Weapon(String nameOfGun,String typeOfGun){
        this.nameOfGun = nameOfGun;
        this.typeOfGun = typeOfGun;
    }

    public String getNameOfGun() {
        return nameOfGun;
    }

    public String getTypeOfGun() {
        return typeOfGun;
    }
}
