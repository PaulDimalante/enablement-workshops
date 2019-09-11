package com.cognizant.cde.damage;

import com.cognizant.cde.dice.GameDie;

public class DamageBarbarian implements Damage {
    public int calcDamage(GameDie die) {
        int damage = die.roll();
        return damage;
    }
}
