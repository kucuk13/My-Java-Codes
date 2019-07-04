package deneme;

import java.util.Random;
import java.util.Scanner;

public class sayıTahminOyunu {
	
	public static void main (String[]args){
				
		Random r = new Random();
		int cevap = (r.nextInt(99)+1);
		
		Scanner oku = new Scanner(System.in);
		
		int odul = 0;
		for (int i = 0; i < 5;i++){
			System.out.print(+ i + 1 + ". Tahminin : ");
			int tahmin = oku.nextInt();
			if (tahmin == cevap){
				System.out.println(+ i + 1 + ". adımda bildin. Tebrikler!");
				odul = i + 1;
				break;
			} else if (tahmin < cevap & i < 4){
				System.out.println("Sayıyı büyült.");
			} else if (tahmin > cevap & i < 4){
				System.out.println("Sayıyı küçült.");
			}
		}
		
		switch(odul){
		case 0: System.out.println("Kaybettin. Cevap : " + cevap); break;
		case 1: System.out.println("Bilgisayar kazandın."); break;
		case 2: System.out.println("iPad kazandın."); break;
		case 3: System.out.println("Cep telefonu kazandın."); break;
		case 4: System.out.println("X-BOX One kazandın."); break;
		case 5: System.out.println("Bisiklet kazandın."); break;
		}
		
	}

}
