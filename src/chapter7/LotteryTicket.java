package chapter7;

import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

public class LotteryTicket {
    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 68;

    public static void main(String args[]){
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];

        Random random = new Random();
        for (int i = 0 ; i < LENGTH ; i++){
            int randomNumber = 0;
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while (search(ticket, randomNumber));
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     * this method to search for a value though out an array sequentially.
     * @param ticket this is the array we search through it
     * @param numberToSearchFor this is the value we search for
     * @return true if we found the value or false if we didn't found it
     */
    public static boolean search(int[]ticket,int numberToSearchFor){
        /*
        This is called an enhanced loop.it iterates through array
        and each time assigns the current element to the value
         */
        for (int value : ticket){
            if (value == numberToSearchFor){
                return true;
            }
        }
        // if we reach for this point so that's mean that the number is unique and the entire loop searched.
        return false;
    }
    public static boolean binarySearch(int[]array,int numberToSearchFor){
        //the array must be sorted first
        Arrays.sort(array);
        int key = Arrays.binarySearch(array , numberToSearchFor);
        if (key >= 0){
            return true;
        }
        else return false;
    }
    public static void printTicket(int ticket[]){
        for(int i = 0 ; i < LENGTH ; i++){
            System.out.print(ticket[i]+" | ");
        }
    }
}
