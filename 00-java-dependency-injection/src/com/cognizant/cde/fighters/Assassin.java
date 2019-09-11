package com.cognizant.cde.fighters;

import com.cognizant.cde.dice.*;

public class Assassin implements FighterInterface {
    private GameDie gameDie;
    private GameDie die4 = new FourSidedDie();
    private GameDie die6 = new SixSidedDie();
    private GameDie die8 = new EightSidedDie();
    private GameDie die10 = new TenSidedDie();
    private GameDie die20 = new TwentySidedDie();
    private GameDie die100 = new OneHundredSidedDie();

    public Assassin(GameDie die) {
        gameDie = die;
    }

    public int dealDamage(GameDie die) {
        return die.roll();
    }

    public int dealDamage() {
        int roll = gameDie.roll();
        if (roll == 1) return dealDamage(this.die4);
        if (roll == 2) return dealDamage(this.die6);
        if (roll == 3) return dealDamage(this.die8);
        if (roll == 4) return dealDamage(this.die10);
        if (roll == 5) return dealDamage(this.die20);
        if (roll == 6) return dealDamage(this.die100);
        return 0;
    }
}
