package deneme;

public class karekok {
	
	public static void main (String args[]){
		
		double deger = 3;
		System.out.println(Math.sqrt(deger));
		for (double d = 1; d < 1000; d++){
			if (deger == d * d) {
				System.out.println (d);
				break;
			}
			if (d*d < deger & deger < (d+1)*(d+1)){
				double ilk = d;
				double son = d+1;
				for (int i = 0; i < 100; i++){
					double deneme = (ilk+son)/2;
					if (deger < deneme*deneme){
						son = deneme;
					}
					if (deger > deneme * deneme){
						ilk = deneme;
					}
					if (deger == deneme * deneme){
						break;
					}	
					if (i == 99){
						System.out.println(deneme);

					}
				}
			}
		}			
	}
}