import java.util.Random;
import java.util.Scanner;

public class Num {

	public static void main(String[] args) {
		Random Random_number= new Random();
		int right_guess=Random_number.nextInt(100);
		int chance=0;
		Scanner scan = new Scanner(System.in);
        System.out.println("...WELCOME TO THE NUMBER GUESSING GAME..." );
		System.out.println("Guess a number between 1 to 100, You will have 10 chances!" );
		System.out.println("Good luck!");		    
	    int guess;
		boolean win=false;
		while(win==false) {
			guess=scan.nextInt();
			chance++;	    
			if(guess==right_guess) {
				win=true;
			}
			else if(chance>9){
				System.out.println("You lost the game! the right answer was: "+right_guess);
			    return;
			}
			else if(guess<right_guess){
				System.out.println("Your Guess is lower than the right guess!... Chances left: "+(10-chance));      
			}
			else if(guess>right_guess) {
				System.out.println("Your Guess Is Higher Than THe Right Guess!... Chances left: "+(10-chance));      
			}
		}
		System.out.println("You Won The Game!");
		System.out.println("You used "+chance+" turns to guess the right number");
	    System.out.println("Your score is "+((11-chance)*10)+" out of 100");		    
	}
}