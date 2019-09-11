# Dependency Injection using Basic Java

## Problem

You are to complete the combat board game "Dependency Injection".  The fighters get their source of power from various means of injection.
You already created a Warrior, now you must create the other classes.  Create the classes by implementing the Fighter Interface and implementing
Dependency Injection as dictated by their background story.

### Barbarian
##### Injection: Constructor 
##### Damage: 1d20

The barbarian is a ferocious fighter of brute strength.  The barbarian rolls 1d20 (one twenty-sided die) when calculating damage.  
To represent his raw power, his source of power comes from a "Constructor".

### Knight
##### Injection: Setter 
##### Damage: 2d10

The knight is a strong and disciplined warrior adorned in plate armor.  He rolls 2d10 to calculate damage.  
The knight is driven by honor and vision "SET" by his King.


### Wizard
##### Injection: Reflection 
##### Damage: 3d6

The wizard is an old sage who occasionally speaks in a mysterious language called "Bytecode".  He rolls 3d6 to calculate damage and his 
source of power comes from a frightening magic called "Reflection"

### Assassin
##### Injection: Parameter 
##### Damage: Special - see below

The Assassin is a master of sleight of hand and must wait for the perfect opportunity to strike.  She only attacks 
with what's available at the time.  Her source of power comes as a "Parameter".

The Assassin must IMPLEMENT the `dealDamage()` method from the Fighter Interface.  Notice that the method does not accept
parameters.

You must implement a `dealDamage(GameDie die)` method that `dealDamage()` calls.  Because the Assassin must lurk in the shadows
and attack at the right opportunity,
her attacks are unpredictable.  Here is how she calculates damage.

A 1d6 die is rolled.  On a roll of:

1. She rolls 1d4 to calculate damage.
2. She rolls 1d6 to calculate damage.
3. She rolls 1d8 to calculate damage.
4. She rolls 1d10 to calculate damage.
5. She rolls 1d20 to calculate damage.
6. She rolls 1d100 to calculate damage. 

`dealDamage()` should pass the appropriate GameDie to `dealDamage(GameDie die)`.
