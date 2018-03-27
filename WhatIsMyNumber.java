
package whatismynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kimgabriell
 */
public class WhatIsMyNumber {
    
    int theNumber;
    int max;
    Scanner scanner = new Scanner (System.in);
    
    public WhatIsMyNumber(){
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
        
    }

    public void Play (){
        while (true){
        int move = scanner.nextInt();
        if (move > theNumber){
            System.out.println("The Number you input is too High");
            
        }   else if (move < theNumber) {
            System.out.println("The Number you input is too Low");
            
        }   else {
            System.out.println("You Got It!" + "Game Over");
            break;
        }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WhatIsMyNumber guessGame = new WhatIsMyNumber();
        System.out.println("Welcome Player, Try to Guess what's the Number");
        guessGame.Play();
    }
    
}
