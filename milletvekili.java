package deneme;

public class milletvekili {

	public static int[] countMv(int[] oy, int numberOfMv){
		int[] mv = new int[numberOfMv]; // all values are 0
		for (int i = 0; i < numberOfMv; i++){
			int max = 0;
			int maxIndex = 0;
			for (int j = 0; j < oy.length; j++){
				int temp = oy[j] / (mv[j] + 1);
				if (temp > max){
					max = temp;
					maxIndex = j;
				}
			}
			mv[maxIndex]++;
		}
		return mv;
	}
	
	public static void main(String[] args) {
		int[] votes = new int[]{111, 55, 35, 1};
		int numberOfMv[] = countMv(votes, 7);
		for (int i = 0; i < votes.length; i++){
			System.out.println(i + 1 + ". parti milletvekili sayýsý: " + numberOfMv[i]);
		}
	}
}
