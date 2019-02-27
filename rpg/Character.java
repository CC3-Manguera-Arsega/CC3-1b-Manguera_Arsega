/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

public class Character {
    static Dice dice = new Dice();

    private String name;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int maxLife;
    private int currentLife;
    
    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.maxLife = 300;
        this.currentLife = this.maxLife;
    }
    
    //
    public int attack() {
        
        return dice.roll() * this.strength;
    }

    public void wound(int damage) {
        this.currentLife -= damage;
    }
    
    public void heal(int heal) {
     if(this.currentLife + heal <= this.maxLife){
            this.currentLife += heal;
        }
        else{
            this.currentLife = this.maxLife;
        }
    }


    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }


    public int getDexterity() {
        return this.dexterity;
    }
    
    public int getIntelligence() {
        return this.intelligence;
    }

    public int getCurrentLife() {
        return this.currentLife;
    }

    public int getMaxLife() {
        return this.maxLife;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int str) {
        this.strength = str;
    }

    public void setDexterity(int dex) {
        this.dexterity = dex;
    }
    

    public void setIntelligence(int intel) {
        this.intelligence = intel;
    }


    public void setCurrentLife(int hp) {
        this.currentLife = hp;
    }


    public void setMaxLife(int maxHp) {
        this.maxLife = maxHp;
    }
}

