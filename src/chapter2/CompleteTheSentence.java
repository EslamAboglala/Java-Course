package chapter2;

import java.util.Scanner;

public class CompleteTheSentence {

    public static void main(String arg[]){

        // Ask for the season of the year
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Ask for the whole number
        System.out.println("Enter the whole number:");
        int number = scanner.nextInt();


        // Ask for the adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        // Display sentence
        System.out.println( "On a " + adjective +" " + season + " day, I drink a minimum of " + number + " cups of coffee." );
    }
}
