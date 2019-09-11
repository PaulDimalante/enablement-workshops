package com.cognizant.cde.fighters;

import com.cognizant.cde.damage.Damage;
import com.cognizant.cde.dice.GameDie;

public class Wizard implements FighterInterface {
    private GameDie gameDie;
    private Damage damage;

    public int dealDamage() {
        return this.damage.calcDamage(this.gameDie);
    }
}
