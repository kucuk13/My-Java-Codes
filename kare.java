package deneme;

import java.util.Scanner;

public class kare{
	public static void main(String args[]){
		
		Scanner oku = new Scanner(System.in);
		System.out.print("Kaça kaçlýk bir kare istiyorsunuz?");
		int x = oku.nextInt();
		
	for (int i = + x; i >= 1; i--) {
		for (int j = 1; j <= + x; j++){
			System.out.print(" * ");
		}
		System.out.println();
	}

	}

}