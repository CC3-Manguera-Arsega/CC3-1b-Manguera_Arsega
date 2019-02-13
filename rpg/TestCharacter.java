/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

public class TestCharacter {
     public TestCharacter(){
        Character p1 = new Character("Joe", 2, 0, 6);
        Character p2 = new Character("Bob", 6, 0, 2);
        
        for(int i = 1; i <= 3; i++){    
            System.out.println("Round "+i);
            System.out.println(p1.getName()+": "+p1.getCurrentLife());
            System.out.println(p2.getName()+": "+p2.getCurrentLife());
            int damage1 = p1.attack(), damage2 = p2.attack();
            System.out.println(p1.getName()+" attacks "+p2.getName()+" for "+damage1);
            System.out.println(p2.getName()+" attacks "+p1.getName()+" for "+damage2);
            p2.wound(damage1);
            p1.wound(damage2);
            if(p1.getCurrentLife() <= 0){
                System.out.println(p1.getName()+" wins!");
                break;
            }
            if(p2.getCurrentLife() <= 0){
                System.out.println(p2.getName()+" wins!");
                break;
            }
        }
    }
}
