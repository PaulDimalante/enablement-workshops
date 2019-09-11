package com.cognizant.cde.fighters;

import com.cognizant.cde.damage.Damage;
import com.cognizant.cde.dice.GameDie;

public class Knight implements FighterInterface {
    private GameDie gameDie;
    private Damage damage;

    public void setDamage(Damage damage) {
        this.damage = damage;
    }

    public void setGameDie(GameDie gameDie) {
        this.gameDie = gameDie;
    }

    public int dealDamage() {
        return this.damage.calcDamage(this.gameDie);
    }
}
