package deneme;

public class SkorHesaplama {
	
	static double[] yakinlik = new double[6];
	static double[] skorSans = new double[6];
	static double skorSansToplam;
	static double[] skorSansYuzde = new double[6];
	static double[] evSahibi = new double[6];
	static double[] deplasman = new double[6];
	
	public static double[] islemler (double ort, double sapma){
		for (int i = 0; i < yakinlik.length; i++){
			yakinlik[i] = (Math.max(ort, i) - Math.min(ort, i)) / sapma;
		}
		
		for (int i = 0; i < skorSans.length; i++){
			skorSans[i] = Math.sqrt(1/yakinlik[i]);
		}
		
		skorSansToplam = 0;
		for (int i = 0; i < skorSans.length; i++){
			skorSansToplam += skorSans[i];
		}
		
		for (int i = 0; i < skorSansYuzde.length; i++){
			skorSansYuzde[i] = skorSans[i] / skorSansToplam;
		}
		return skorSansYuzde;
	}
	
	public static double[] topla (double[] d1, double[] d2){
		double[] d = new double[6];
		for (int i = 0; i < d.length; i++){
			d[i] = d1[i] + d2[i];
		}
		return d;
	}
	
	public static void bol(double[] d){
		for (int i = 0; i < d.length; i++){
			d[i] /= 3;
			d[i] *= 100;
		}
	}
	
	public static void main(String [] args){
		evSahibi = topla(islemler(1.5, 1.27), islemler(1.6, 0.97));
		double[] d = new double[] {0.15, 0.4, 0.25, 0.15, 0.05, 0};
		evSahibi = topla(evSahibi, d);
		bol(evSahibi);
		
		deplasman = topla(islemler(0.9, 0.99), islemler(1.8, 1.23));
		d = new double[] {0.25, 0.4, 0.15, 0.15, 0.05, 0};
		deplasman = topla(deplasman, d);
		bol(deplasman);
		
		for (int i = 0; i < evSahibi.length; i++){
			for (int j = 0; j < deplasman.length; j++ ){
				double x = evSahibi[j] * deplasman[i] / 100;
				System.out.print(x + "\t");
			}
			System.out.println();
		}
		
	}

}
