package deneme;

public class insertionSort {
	
	public static void main (String args[]){
		
		int [] dizi = new int [6];
		dizi[0] = 5;
		dizi[1] = 4;
		dizi[2] = 1;
		dizi[3] = 3;
		dizi[4] = 6;
		dizi[5] = 2;
		
		for (int i = 0; i < dizi.length; i++){
			for (int j = 0; j<dizi.length-1; j++){
				if (dizi[j+1] < dizi[j]){
					int a = dizi[j+1];
					dizi [j+1]=dizi[j];
					dizi[j]= a;
				}
			}
		}
		
		System.out.println(dizi[0]);
		System.out.println(dizi[1]);
		System.out.println(dizi[2]);
		System.out.println(dizi[3]);
		System.out.println(dizi[4]);
		System.out.println(dizi[5]);
		
	}

}
