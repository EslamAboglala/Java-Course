package chapter7;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String args[]) {
        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 1 || num > 7){
            System.out.println("You entered invalid number,Please enter number between 1and 7");
        }
        scanner.close();
        System.out.println(daysOfTheWeek[num - 1]);
    }
}

