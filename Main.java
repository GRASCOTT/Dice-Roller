package DnDRoller;
import java.util.Scanner;
import javax.swing.JFrame;

//import java.lang.Math.*;
//D4, D6, D8, D10, D12, D20
public class Main {

    public static void main(String[] args) {
        
       JFrame frame = new RollUI();  //the name of the form
       frame.setTitle("Roll Them Dice!");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //When they click on the x in top riht, it will close
       frame.setVisible(true);  //Gotta make the GUI visible

    } //End of main class
    
    public static boolean rollAgain() 
    {
        Scanner in = new Scanner(System.in);        
        System.out.println("Do you want to roll again? y/n");
        String response = in.next().toLowerCase();
        return response.equals("y");
    }


///////////////////////////////////////////////////////////////////////////////
} //end javaapplication3