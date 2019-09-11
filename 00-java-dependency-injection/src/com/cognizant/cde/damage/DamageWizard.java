package com.cognizant.cde.damage;

import com.cognizant.cde.dice.GameDie;

public class DamageWizard implements Damage {
    public int calcDamage(GameDie die) {
        int damage = die.roll()+die.roll()+die.roll();
        return damage;
    }
}
