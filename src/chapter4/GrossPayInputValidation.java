package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String args[]){

        //Initialize the known variables
        int rate = 15;
        int maxHours = 40;
        int minHours = 1;

        //Get input for unknown variables
        System.out.println("How many hours did you work this weak?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < minHours){
            System.out.println("Invalid Entry. Your hours must be between 1 and 40. Try again.");
             hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        //Calculate the gross
        double gross = rate * hoursWorked;
        System.out.println("Gross pay =$" + String.format("%.2f",gross));
    }
}
