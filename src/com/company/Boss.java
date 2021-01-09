package com.company;

public class Boss extends GameEntity {
    private Weapon boss_sGun;
    public Boss(int charakterHealth, int characterDamage, Weapon boss_sGun) {
        super(charakterHealth, characterDamage);
        this.boss_sGun = boss_sGun;
    }

    public Weapon getBoss_sGun() {
        return boss_sGun;
    }

    public void setBoss_sGun(Weapon boss_sGun) {
        this.boss_sGun = boss_sGun;
    }


}
