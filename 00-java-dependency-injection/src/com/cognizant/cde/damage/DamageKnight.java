package com.cognizant.cde.damage;

import com.cognizant.cde.dice.GameDie;

public class DamageKnight implements Damage {
    public int calcDamage(GameDie die) {
        int damage = die.roll()+die.roll();
        return damage;
    }
}
