package com.cognizant.cde.fighters;

import com.cognizant.cde.damage.Damage;
import com.cognizant.cde.dice.GameDie;

public class Knight implements FighterInterface {
    private GameDie gameDie;
    private Damage damage;

    public Knight(GameDie die) {
        gameDie = die;
    }

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public int dealDamage() {
        return this.damage.calcDamage(this.gameDie);
    }
}
