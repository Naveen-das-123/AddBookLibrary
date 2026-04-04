package TheoryOoops;

import java.util.*;

public class guessGame {
    public static void main(String[] args) {
        // Creatin guess number game
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

       
        int UserInput;
        int GuessNumber = r.nextInt(10);

        System.out.println("Hello what's up?"); // It's nothing ignore it.

        while (true) {
            System.out.print("Enter the guessNumber = ");
            UserInput = sc.nextInt();
        
            // check 
            if (UserInput == GuessNumber) {
                System.out.println("True");
                return;
            }
            else System.out.println("False");
        }
    }
}
