import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		

	
		//you choose
		System.out.println("Choose [r]ock, [p]aper or [s]cissors: ");
		
		Scanner scan = new Scanner(System.in);
		char yourMove = scan.nextLine().charAt(0);
		
		//computer choose
		char computerMove=' ';
		while(computerMove!='r'||computerMove!='s'||computerMove!='p') {
			
		Random random = new Random ();
		
		char randomChar = (char)(random.nextInt(26)+'a');
		
		if(randomChar=='r'||randomChar=='s'||randomChar=='p') {
			computerMove=randomChar;
			
			if(computerMove=='r')System.out.println("The computer chose Rock.");
			else if(computerMove=='s')System.out.println("The computer chose Scissors.");
			else if(computerMove=='p')System.out.println("The computer chose Paper.");

			break;
		}
		else {computerMove=randomChar;
		continue;}
		}
		
		//win or loose
		
		if(yourMove==computerMove) {
			System.out.println("This game was a draw.");
		}
		
		else if(yourMove=='r'&&computerMove=='p'||yourMove=='p'&&computerMove=='s'||
				yourMove=='s'&&computerMove=='r') {
			System.out.println("You lose.");
		}
		
		else if(yourMove=='r'&&computerMove=='s'||yourMove=='p'&&computerMove=='r'||
				yourMove=='s'&&computerMove=='p') {
			System.out.println("You win.");
		}
		
	}

}
