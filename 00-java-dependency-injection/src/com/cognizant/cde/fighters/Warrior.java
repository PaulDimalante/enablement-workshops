package com.cognizant.cde.fighters;

import com.cognizant.cde.dice.GameDie;

public class Warrior implements FighterInterface {
    private GameDie gameDie;

    public Warrior(GameDie die) {
        gameDie = die;
    }

    public int dealDamage() {
        int damage = gameDie.roll();
        if (damage >= 19) {
            damage = damage * 3;
        }
        return damage;
    }
}
