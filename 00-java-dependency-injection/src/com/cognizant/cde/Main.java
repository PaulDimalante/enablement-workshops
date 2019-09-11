package com.cognizant.cde;

import com.cognizant.cde.dice.TwentySidedDie;
import com.cognizant.cde.fighters.FighterInterface;
import com.cognizant.cde.fighters.Warrior;

public class Main {

    public static void main(String[] args) {
        //Setup your fighters here!
        FighterInterface fighterA = new Warrior(new TwentySidedDie());
        FighterInterface fighterB = new Warrior(new TwentySidedDie());

        enterTheArena(fighterA, fighterB);
    }

    private static void enterTheArena(FighterInterface fighterA, FighterInterface fighterB) {
        System.out.println("Enter the arena!");

        int damageA = fighterA.dealDamage();
        int damageB = fighterB.dealDamage();

        System.out.println("Fighter A inflicts " + damageA + " damage!");
        System.out.println("Fighter B inflicts " + damageB + " damage!");

        if (damageA > damageB){
            System.out.println("Fighter A Wins!");
        }
        else if (damageA < damageB){
            System.out.println("Fighter B Wins!");
        } else {
            System.out.println("Both fighters are knocked out!");
        }
    }
}
