package com.cognizant.cde.fighters;

import com.cognizant.cde.damage.Damage;
import com.cognizant.cde.dice.GameDie;

public class Barbarian implements FighterInterface {
    private GameDie gameDie;
    private Damage damage;

    public Barbarian(GameDie die, Damage damage) {
        gameDie = die;
        this.damage = damage;
    }

    public int dealDamage() {
        return this.damage.calcDamage(gameDie);
    }
}
