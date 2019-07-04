package deneme;

public class matrisCarpim {

	public static void main(String[] args){
		
		int A[][] = new int [2][2];		
		int B[][] = new int [2][2];
		int C[][] = new int [2][2];
			
		A[0][0]=1; A[0][1]=-2; A[1][0]=5; A[1][1]=-2;
		B[0][0]=2; B[0][1]=3; B[1][0]=1; B[1][1]=-3;		
		
		for(int i = 0; i<2; i++){
			for(int j=0; j<2; j++){
				C[i][j] = 0;
				for (int k =0;k<1;k++){
					C[i][j] += A[i][j]* B[j][i];
				}

			}
		
		}
			
		for (int i = 0; i<2; i++){
			for (int j =0; j < 2; j++){
				System.out.print(C[i][j] + " ");
				}
			System.out.println();
			
		}
		
	}

	
}
