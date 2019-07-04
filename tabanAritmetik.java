package deneme;

public class tabanAritmetik {
	
	public static void main (String args[]){
		
		//x tabanýnda girilen y sayýsýný z tabanýndaki deðerini çevirir
		
		int x = 4, y = 11, z = 2;
		
		// y kaç basamaklý?
		int basamakSayisi = 0;
		for (int a = 1; a < 15; a++){
			int sonuc1 = (int) (y / (Math.pow(10, a)));
			if (sonuc1 == 0){
				basamakSayisi = a;
				break;
			}
		}
		
		int onlukTaban = 0;
		//x tabanýndaki y sayýsýný 10 tabanýna çevirme
		for (int i = basamakSayisi - 1; i >= 0; i--){
			int sonuc2 = (int)(+ y / (Math.pow(10,i)));
			int sonuc3 = (int)(sonuc2 * (Math.pow(x, i)));
			y = (int) (y - (sonuc2 * (Math.pow(10, i))));
			onlukTaban += sonuc3;
		}
			
		//10 tabanýna çevrilen sayýyý z tabanýna çevirme
		String sonuc = "";
		int sonuc4 = + onlukTaban;
		for (int d = 0; d < 15; d++){
			sonuc4 = sonuc4/z;
			if (sonuc4 < z){
				sonuc = + sonuc4/z + sonuc4%z + sonuc + onlukTaban%z;
				break;
			}else if (sonuc4 >= z){
				sonuc = + sonuc4%z + sonuc;
			}
		}	
		System.out.println (sonuc);	
		
		//kural, virgüllü
		
	}
}
