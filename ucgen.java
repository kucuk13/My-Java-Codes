package deneme;

public class ucgen{

	public static void main(String args[]){
		
		int ucgeninAltTabanUzunlugu = 11;		
		
		for (int i = 1; i <= ucgeninAltTabanUzunlugu; i++){
			
			for (int i1 = ucgeninAltTabanUzunlugu - 1; i1 >= i; i1--){
			System.out.print(" ");
		}
			for (int i2 = 1; i2 <= i; i2++){
			System.out.print("* ");
			
		}
		System.out.println();
	}
		
		
	}
	
}
