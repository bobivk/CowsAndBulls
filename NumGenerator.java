package geekycamp;

public class NumGenerator {


	public static int[] generateNum(){
		int[] number = new int[4];
		int i = 0;
		while(i!= 4){
			int randomInt  = 1 + (int) (Math.random() * 9);
			boolean repeats = false;
			for(int j = 0; j <= 3; j++){
				if(randomInt == number[j]){
					repeats = true;
				}
			}
			if(!repeats){
				number[i] = (char) randomInt;
				i++;
			}
		}
		return number;

	
}
}
