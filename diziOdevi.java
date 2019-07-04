package deneme;

import java.util.Random;

public class diziOdevi {
	
	public static void main (String args[]){
		
		int sayi = 21;
		
		int[] dizi = new int [100];
		
		for (int i = 0; i <100; i++ ){
			Random r = new Random();
			dizi [i] = (r.nextInt(99)+1);
		}
		
		for (int i = 0; i <100; i++){
			if (dizi [i] == sayi)System.out.println(+i+1 + ". eleman");
		}
		
	}

}