package deneme;

import java.util.Scanner;

public class ikinciDerecedenDenklem {

	public static void main(String[] args) {

		Scanner oku = new Scanner(System.in);
		System.out.println("Ýkinci dereceden denklemin köklerini bulan program");
		System.out.print("Denklemin baþ kat sayýsýný giriniz : ");
		int a = oku.nextInt();
		System.out.print("Denklemin x li terimin kat sayýsýný giriniz : ");
		int b = oku.nextInt();
		System.out.print("Denklemin sabit terimini giriniz : ");
		int c = oku.nextInt();

		double delta = +(b * b - 4 * a * c);

		if (delta > 0) {
			System.out.println("Ýki reel kökü var");
			System.out.println("x1 =" + ((-b - Math.sqrt(delta)) / (a * 2)));
			System.out.println("x2 =" + ((-b + Math.sqrt(delta)) / (a * 2)));
		} else if (delta == 0) {
			System.out.println("Tek reel kökü var");
			System.out.println("x = " + (-b / (a * 2)));
		} else if (delta < 0) {
			System.out.println("Reel kökü yok");
		}
	}

}
