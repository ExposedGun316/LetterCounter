/**
 * Created by ExposedGun on 18/12/2015.
 */

import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args){

        String counter;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a word:");
        counter =  userInput.next();

        System.out.println(counter.length());

    }
}
