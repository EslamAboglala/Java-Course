package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String args[]){

        //Get text
        System.out.println("Enter the text you would like to test: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        //Search for letter A
        for (int i = 0; i < text.length() ;i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'a' || currentLetter == 'A'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("This text contain the letter 'A'" );
        }
        else{
            System.out.println("This text does not contain the letter 'A'" );
        }

    }
}
