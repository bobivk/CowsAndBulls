package Cowsandbulls;
import java.util.Scanner;

public class CowsAndBulls {
	public static void guessnum(int[] num, int[] guess, int opiti) {
		boolean guessed = false;
		int kravi = 0;
		int bikove = 0;
		for(int i = 0; i <= 3; i++){
			for(int j = 0; j <= 3; j++){
				if(guess[i] == num[j]){
					if(i == j)bikove++;
					else kravi++;
				}
			}
		}
		if(bikove == 4) guessed = true;
		else {
			System.out.println("Bulls: " + kravi);
			System.out.println("Cows: " + bikove);
			System.out.println("Try again!");
			opiti++;
			input(num, opiti);
		}
		if(guessed) System.out.println("Congratulations, you won! \n Tries: " + opiti);	
	}
	public void input(int[] num, int opiti){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number or 'e' to exit: ");
		String guessstr = scan.nextLine();
		if(guessstr.equals("e")) {
			scan.close();
			return;
		}
		int[] guess = new int[4];
		for(int a = 0; a < 4; a++){
			guess[a] = Character.getNumericValue(guessstr.charAt(a));
		}
		guessnum(num, guess, opiti);
		scan.close();
	}
	public static void main(String[] args){
		
		int opiti = 0;
		input(num, opiti);
	}
}
