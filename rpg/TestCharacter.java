/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

public class TestCharacter {
     public TestCharacter(){
        Character p1 = new Character("SPARTAN ", 30, 0, 2);
        Wizard p2 = new Wizard("WIZARD ", 10, 0, 15,10,10);
        Dice dice2 = new Dice();
        
       
        for(int i = 1;; i++){    
            System.out.println("Round "+i);
            System.out.println(p1.getName()+": "+p1.getCurrentLife());
            System.out.println(p2.getName()+": "+p2.getCurrentLife());
            int damage1 = 0,damage2 = 0,heal2 = 0;
            int dice3 = dice2.roll();
            if (dice3==1||dice3==2){
                damage1 = p1.attack();
                damage2 = p2.attack();
                System.out.println(p1.getName()+" attacks "+p2.getName()+" for "+damage1);
                System.out.println(p2.getName()+" attacks "+p1.getName()+" for "+damage2);
                p2.wound(damage1);
                p1.wound(damage2);
            }
            if (dice3==3||dice3==4){
                damage1 = p1.attack();
                damage2 = p2.castLightningBolt();
                System.out.println(p1.getName()+" attacks "+p2.getName()+" for "+damage1);
                System.out.println(p2.getName()+" Cast Lightning Bolt "+p1.getName()+" for "+damage2);
                p2.wound(damage1);
                p1.wound(damage2);
            }
            if (dice3==5||dice3==6){
                damage1 = p1.attack();
                heal2 = p2.castHeal();
                System.out.println(p1.getName()+" attacks "+p2.getName()+" for "+damage1);
                System.out.println(p2.getName()+" Healed for "+heal2);
                p2.heal(heal2-damage1);
                p1.wound(damage2);
                
            }
            System.out.println("Current Health of Spartan: "+p1.getCurrentLife());
            System.out.println("Current Health of Wizard: "+p2.getCurrentLife());
            if(p1.getCurrentLife() <= 0){
                System.out.println(p2.getName()+" wins!");
                break;
            }
            if(p2.getCurrentLife() <= 0){
                System.out.println(p1.getName()+" wins!");
                break;
            }
            System.out.println("");
        }
    }
}
