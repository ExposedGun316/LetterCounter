/**
 * Created by ExposedGun on 18/12/2015.
 */

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args){

        //Counts number of letters
        String counter;

        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a word:");
        counter =  userInput.next();

        System.out.println("There is " + counter.length() + " letters in this wordR");

        //Counts number of vowels and consonants
        int vowels = 0;
        int consonants = 0;

        for(int i = 0;i < counter.length(); i ++){
            char ch = counter.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else{
                consonants++;
            }

        }
        System.out.println("There is " + vowels + " vowels in this word");
        System.out.println("There is " + consonants + " consonants in this word");
    }
}
