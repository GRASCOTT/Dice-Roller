/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnDRoller;
import java.util.Random;

public class Dice {
    private int diceSides;
    
    public Dice(){
    }
    
    public Dice(int diceSides){
        this.diceSides = diceSides;
    }
    
    public int result(){
        Random random = new Random();
        int min = 1;
        int randomNum = random.nextInt(diceSides) + min;
        return randomNum;
    }
    
    public int result(int diceSides) { //overrrLOOOOAAAD!!!
        Random random = new Random();
        int min = 1;
        int randomNum = random.nextInt(diceSides) + min;
        return randomNum;       
    }

}
