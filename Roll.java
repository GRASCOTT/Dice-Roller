/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DnDRoller;
import java.util.HashMap;
import java.util.Map;
        
public class Roll {
    private int d4Count; 
    private int d6Count;
    private int d8Count;
    private int d10Count;
    private int d12Count;
    private int d20Count;
    
    private final HashMap<Integer, Integer> rollMap;
    
    public Roll(int d4Count, int d6Count, int d8Count, int d10Count, int d12Count, int d20Count) {
       
        this.d4Count = d4Count;
        this.d6Count = d6Count;
        this.d8Count = d8Count;
        this.d10Count = d10Count;
        this.d12Count = d12Count;
        this.d20Count = d20Count;
        
        rollMap = new HashMap<Integer, Integer>();
    }
    
    public void clearRoll(){
        this.d4Count = 0;
        this.d6Count = 0;
        this.d8Count = 0;
        this.d10Count = 0;
        this.d12Count = 0;
        this.d20Count = 0;
    }
    
    public void addDiceToRoll(){
        try {
        rollMap.put(4, d4Count);
        rollMap.put(6, d6Count);
        rollMap.put(8, d8Count);
        rollMap.put(10, d10Count);
        rollMap.put(12, d12Count);
        rollMap.put(20, d20Count);
        } catch (Exception e) {
            System.out.println("Error occurred pushing values to hashmap");
        }
    }
    
    public String rollThemDiiice(){
        String rollResultMsg = "";
        for (Map.Entry<Integer, Integer> entry : rollMap.entrySet()) 
        {
            int diSides = entry.getKey();
            int diQuantity = entry.getValue();
            if(diQuantity > 0) 
            {
                for(int i = 1 ; i <= diQuantity ; i++) 
                {
                    //create a dice object and roll that sucker!
                    Dice thisRoll = new Dice(diSides);
                    int rollRes = thisRoll.result();
                    System.out.println("d" + diSides + " rolled a " + rollRes);

                    rollResultMsg += "\nd" + diSides + ": " + rollRes;
                }
            }
        }
        return rollResultMsg;
    }
}

/*
    Looping through a hash map:
    //Loop through the keys
    for(Int s : roll.keySet())
    {
        System.out.println("Here's a key");
    }
    //The values
    for(Int s : roll.Values())
    {
        System.out.println("Here's a value");
    }
    //To loop through the key value pairs as an array 
    


*/