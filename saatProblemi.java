package deneme;

public class saatProblemi {
	
	public static void main (String args[]){
		
		// x saniye sonra saat kaç olur
		int süreSaat = 23; int süreDakika = 40; int süreSaniye = 45; int x = 4996;
		
		// saniyeyi saate çevir
		int saniye = x %60;
		x = x/60;
		int dakika = x%60;
		int saat = x/60;
		System.out.println(saat + " " + dakika + " " + saniye);
		
		süreSaniye += saniye;
		if (süreSaniye > 60) {
			süreDakika++;
			süreSaniye = süreSaniye % 60;
		}
		
		süreDakika += dakika;
		if (süreDakika > 60){
			süreSaat++;
			süreDakika = süreDakika % 60;
		}
		
		süreSaat += süreDakika;
		if (süreSaat > 24) {
			süreSaat = süreSaat % 24;
		}

		System.out.println(süreSaat);
		System.out.println(süreDakika);
		System.out.println(süreSaniye);
			
	}

}
