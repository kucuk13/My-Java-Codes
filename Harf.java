package deneme;

import java.util.Arrays;
import java.util.Random;

public class Harf {

	public static void main(String[] args) {
		int[] arr = new int[100];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(100) + 1;
		}
		Arrays.sort(arr);
		
		int AA = arr[100 - ((arr.length * 8)  /100)];
		int BA = arr[100 - ((arr.length * 18) /100)]; 
		int BB = arr[100 - ((arr.length * 32) /100)]; 
		int CB = arr[100 - ((arr.length * 47) /100)]; 
		int CC = arr[100 - ((arr.length * 60) /100)]; 
		int DC = arr[100 - ((arr.length * 71) /100)]; 
		int DD = arr[100 - ((arr.length * 78) /100)]; 
		System.out.println("AA: " + AA + " ");
		System.out.println("BA: " + BA + " ");
		System.out.println("BB: " + BB + " ");
		System.out.println("CB: " + CB + " ");
		System.out.println("CC: " + CC + " ");
		System.out.println("DC: " + DC + " ");
		System.out.println("DD: " + DD + " ");
		
		for (int i = arr.length - 1; i >= 0; i--){
			if (arr[i] >= AA){
				System.out.println(arr[i] + " AA");
			}
			else if (arr[i] >= BA){
				System.out.println(arr[i] + " BA");
			}
			else if (arr[i] >= BB){
				System.out.println(arr[i] + " BB");
			}
			else if (arr[i] >= CB){
				System.out.println(arr[i] + " CB");
			}
			else if (arr[i] >= CC){
				System.out.println(arr[i] + " CC");
			}
			else if (arr[i] >= DC){
				System.out.println(arr[i] + " DC");
			}
			else if (arr[i] >= DD){
				System.out.println(arr[i] + " DD");
			}
			else {
				System.out.println(arr[i] + " FF");
			}
		}
		
	} // end function

} // end class
