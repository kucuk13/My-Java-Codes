package deneme;

public class bubbleSort {
	
	public static void main (String [] args){
		
		int [] dizi = new int [5];
		dizi [0] = 23;
		dizi [1] = 12;
		dizi [2] = 40;
		dizi [3] = 17;
		dizi [4] = 22;
		
		for (int i = 0 ; i<dizi.length ; i++){
			for (int j = dizi.length - 1; j>0; j--){
				if (dizi[j-1] > dizi[j]){
					int a = dizi[j];
					dizi [j] = dizi [j-1];
					dizi [j-1] = a;
				}
			}
			
		}
		System.out.println(dizi[0]);
		System.out.println(dizi[1]);
		System.out.println(dizi[2]);
		System.out.println(dizi[3]);
		System.out.println(dizi[4]);
		
	}

}
