import java.util.*;
import java.util.Random;
public class GuessNum {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random rand=new Random();
        int score=0;
        boolean PlayAgain = true;
        System.out.println("Let's begin!" );

        while(PlayAgain){
            int tgt=rand.nextInt(100)+1;
            int chances =5;
            boolean found =false;
            System.out.println("I have thought of a numb between 1 and 100.");
            System.out.println("You have "+ chances + " try to find it!");
            for(int attempt = 1; attempt <= chances;attempt++){
                System.out.println("Attempt "+ attempt + " Enter your guess: ");
                if(!input.hasNextInt()){
                    System.out.println("Oops! Numb only, Please");
                    input.next();
                    attempt--;
                    continue;
                }
                int guess=input.nextInt();
                if(guess == tgt){
                    System.out.println("Excellent! you nailed it in "+ attempt +"tries.");
                    score += (5- attempt)*2;
                    found =true;
                    break;
                }else if(guess < tgt){
                    System.out.println("Too low");
                }else{
                    System.out.println("Too high");
                }
            }
            if(!found){
                System.out.println("Out of attempts! The numb was: "+ tgt);
            }
            System.out.println("Current Score:" + score);
            System.out.print("Would you like to play again? (y/n): ");
            input.nextLine();
            String reply = input.nextLine().trim().toLowerCase();
            PlayAgain=reply.equals("y") || reply.equals("yes");
        }
        System.out.println("Thanks for playing! Final Score: "+ score);
    }
}
