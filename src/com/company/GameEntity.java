package com.company;

public class GameEntity {
    private int charakterHealth;
    private int characterDamage;
    GameEntity(int charakterHealth,int characterDamage){
         this.charakterHealth = charakterHealth;
         this.characterDamage = characterDamage;
    }

    public int getCharakterHealth() {
        return charakterHealth;
    }

    public void setCharakterHealth(int charakterHealth) {
        this.charakterHealth = charakterHealth;
    }

    public int getCharacterDamage() {
        return characterDamage;
    }

    public void setCharacterDamage(int characterDamage) {
        this.characterDamage = characterDamage;
    }
}
