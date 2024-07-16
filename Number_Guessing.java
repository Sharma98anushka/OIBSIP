import java.util.*;
class Number_Guessing{

   public static void main(String args[]){
        //Generate a random number: within a specified range, such as 1 to 100.
        System.out.println("Welcome to Guess the Number Game!! ");
        
        int round=1;
        
       Scanner sc = new Scanner(System.in);
    while(true){
            int num = (int) (Math.random() * 100 + 1);
            int trials=10;
            int score=0;
            
       for(int i=1;i<=trials;i++){
        System.out.print("Enter your guess for the generated number: ");
        
        int n=sc.nextInt();
        if(n==num){
            System.out.println("You guessed the number correctly");
            System.out.println("You have guessed the number in "+i+" attempts");
            score=trials-i;
              break;
        }
        else if(n<num){
            System.out.println("Your guess is too low");
            System.out.println("Try again");
        }
        else if(n>num){
            System.out.println("Your guess is too high");
            System.out.println("Try again");
        }
        if(i==trials){
            System.out.println("You have exhausted all the "+ trials +" attempts");
            System.out.println("The number is "+ num);
        }
       }
       
       System.out.println("Your score for "+round+" round is " + score);
       System.out.println("Do yo want to play again (0/1)");
       int k=sc.nextInt();
       if(k == 1){
        round++;
        System.out.println("Round: "+ round);
        
       }
       else{
         break;
       }
    }  
    System.out.println("Thank you for playing!!\n"+"You played "+ round +" round");
    
    }
   
}
