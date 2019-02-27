/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author m304user
 */
public class Wizard extends Character {

    int maxMagic;
    int currentMagic;
    public Wizard(String n, int s, int d, int i, int maxMagic, int currentMagic){
        super(n,s,d,i);
        this.maxMagic = dice.roll()*4;
        this.currentMagic = this.maxMagic;
    }
    public int castLightningBolt(){
        if (this.currentMagic >= 5){
            this.currentMagic-=5;
            return dice.roll() * super.getIntelligence();
        }else return 0;
    }
    //shield only last for tthe turn it was cast
    public int castHeal(){
         return dice.roll() * super.getIntelligence();
    }
    public int getmaxMagic(){
        return this.maxMagic;
    }
    public int getcurrentMagic(){
        return this.currentMagic;
    }
}
