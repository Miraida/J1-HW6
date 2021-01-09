package com.company;

public class Main {

    public static void main(String[] args) {
	//
        Weapon weapon = new Weapon("Mini 14","DMR");
        Boss boss = new Boss(700,50,weapon);
        System.out.println();
        System.out.println("Health: "+ boss.getCharakterHealth()+", Damage: "+ boss.getCharacterDamage()+
                            ", Boss's gun: "+boss.getBoss_sGun().getNameOfGun()+" "+boss.getBoss_sGun().getTypeOfGun());

    }
}
