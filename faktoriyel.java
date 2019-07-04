package deneme;

public class faktoriyel {
	
	public static void main (String [] args){
		
		int x = 6, sonuc = 1;
		
		for (int i = 1; i <= x; i++){
			sonuc = sonuc * i;
		}	
		System.out.print(+ x + "! = " + sonuc);
		
	}

}
