package chapter4;

import java.util.Random;

public class RollTheDie {
    public static void main(String args[]) {

        int i = 0 , spacesLeft = 20 , spacesNow = 0 , die = 0;
        while( i < 5 )
        {
            Random random = new Random();
            die = random.nextInt(6) + 1;
            spacesNow = spacesNow + die;
            spacesLeft = spacesLeft - die;
            i++;
            System.out.println("Roll #"+i+": You've rolled a "+die+". You are now on space "+spacesNow+" and have "+spacesLeft+" more to go.");
            if(spacesNow > 20)
                break;
        }
        if(spacesNow == 20)
            System.out.println("Roll #"+i+": You've rolled a "+die+". You are now on space "+spacesNow+". Congrats!, you win!");
        else if(spacesNow > 20)
            System.out.println("Sorry!, you lose in roll number "+ i+" the spaces exceeded 20,try again.");
        else
            System.out.println("Sorry!, you lose the spaces is less than 20,try again.");
    }
}
