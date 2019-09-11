package com.cognizant.cde;

import com.cognizant.cde.damage.DamageAssassin;
import com.cognizant.cde.damage.DamageBarbarian;
import com.cognizant.cde.damage.DamageKnight;
import com.cognizant.cde.damage.DamageWizard;
import com.cognizant.cde.dice.SixSidedDie;
import com.cognizant.cde.dice.TenSidedDie;
import com.cognizant.cde.dice.TwentySidedDie;
import com.cognizant.cde.fighters.*;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        //Setup your fighters here!
        FighterInterface fighterA;
        FighterInterface fighterB;

        System.out.println("warrior vs warrior");
        fighterA = new Warrior(new TwentySidedDie());
        fighterB = new Warrior(new TwentySidedDie());
        enterTheArena(fighterA, fighterB);

        System.out.println("barbarian vs knight");
        fighterA = new Barbarian(new TwentySidedDie(), new DamageBarbarian());
        Knight knight = new Knight();
        knight.setGameDie(new TenSidedDie());
        knight.setDamage(new DamageKnight());
        fighterB = knight;
        enterTheArena(fighterA, fighterB);

        System.out.println("wizard vs assassin");
        Wizard wizard = new Wizard();

        Class<?> cls = wizard.getClass();
        Field damageDependency = null;
        Field dieDependency = null;
        try {
            damageDependency = cls.getDeclaredField("damage");
            dieDependency = cls.getDeclaredField("gameDie");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        //This bypasses private access modifier
        damageDependency.setAccessible(true);
        dieDependency.setAccessible(true);
        try {
            damageDependency.set(wizard, new DamageWizard());
            dieDependency.set(wizard, new SixSidedDie());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        fighterA = wizard;
        fighterB = new Assassin(new DamageAssassin());
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
