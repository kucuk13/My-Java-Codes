package deneme;

public class asalSayi {
	
	public static void main(String args[]){
		
		int asalMý = 14;
				
		for (int i = 2; i < asalMý/2; i++){
			int deneme = asalMý % i;
			if (deneme == 0){
				System.out.print("asal deðildir");
				return;
			}	
		}
		
		System.out.print("asaldýr");
	
	}
	
}