package chapter7;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("How many grades do you want to enter? ");
        grades = new int[scanner.nextInt()];
        getGrades();
        System.out.println("The average grade is: "+String.format("%.2f",calculateAverage()));
        System.out.println("The highest grade is: "+getHighest());
        System.out.println("The lowest grade is: "+getLowest());
    }
    public static void getGrades(){
        for (int i = 0 ; i < grades.length ; i ++){
            System.out.println("Enter grade # "+(i+1));
            grades[i] = scanner.nextInt();
        }
    }
    public static int calculateSum(){
        int sum = 0;
        for (int grade : grades){
            sum += grade;
        }
            return sum;
    }
    public static double calculateAverage(){
       return (calculateSum()/grades.length);
    }
    public static int getHighest(){
        int highest = grades[0];
        for (int grade : grades){
            if(highest < grade){
                highest = grade;
            }
        }
        return highest;
    }
    public static int getLowest(){
        int lowest = grades[0];
        for (int grade : grades){
            if(lowest > grade){
                lowest = grade;
            }
        }
        return lowest;
    }
}
