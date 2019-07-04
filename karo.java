package deneme;

public class karo {
	
	public static void main (String args[]){
		
		int karonunOrtaKenarUzunlugu = 6;		
		
		for (int i = 0 ; i < karonunOrtaKenarUzunlugu; i++){
			
			for (int j = karonunOrtaKenarUzunlugu; j > i + 1; j--){
				System.out.print(" ");
			}
			for (int k = 0; k < i + 1; k++){
				System.out.print("* ");
			}
			System.out.println();
		
		}
		
		for (int i = 0; i < karonunOrtaKenarUzunlugu - 1 ; i++){
			
			for (int j = 0; j <= i; j++){
				System.out.print(" ");
			}
			for (int k = karonunOrtaKenarUzunlugu - 1; k > i; k--){
				System.out.print("* ");
			}
			System.out.println();
		
		}

	}
	
}