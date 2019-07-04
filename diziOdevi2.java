package deneme;

import java.util.Random;

public class diziOdevi2 {
	
	public static void main (String args []){
		
		int a = 35;
		
		int dizi [] = new int [100];
		
		for (int i = 0; i<100; i++){
			Random r = new Random ();
			dizi [i] = (r.nextInt(99)+1);			
		}
		
		for (int i = 0; i <100; i++){
			if (dizi [i] == a)System.out.println(+i + 1 + ". eleman");
		}
		
	}

}
