package deneme;

import java.util.Random;

public class FootballGame {
	
	static boolean[] isHost = new boolean[90];
	static boolean[] times = new boolean[90];
	String name;
	int score;
	int point;
	
	public FootballGame(String name, int point){
		this.name = name;
		this.point = point;
		this.score = 0;
	}
		
	public static int randomNumber(int min, int max){
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
	
	public static void stop(int second){
		try {
		    Thread.sleep(second * 1000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	public static int distance (int x, int y){
		return Math.max(x, y) - Math.min(x, y);
	}
	
	public static void goals(FootballGame host, FootballGame away){
		int totalScore = host.point + away.point + 5; 
		int goalChance = randomNumber(21, 29);
		for (int i = 0; i < 8; i++){
			if (goalChance > randomNumber(1, 100)){
				//calculate time
				int x = randomNumber(0, 89);
				while(times[x] == true){
					x = randomNumber(0, 89);
				}
				times[x] = true;
				
				//which team
				int y = randomNumber(1, totalScore);
				if (y > away.point){
					isHost[x] = true;
					host.score++;
				} else {
					away.score++;
				}
			} // end if
		} // end for
	} // end goals
	
	public static void printScoreBoard(FootballGame host, FootballGame away){
		for (int i = 0; i < 90; i++){
			stop(1);
			System.out.print(i + 1 + "' ");
			printWhichTeam(host, away, i);
			System.out.println();
		}
		System.out.println(host.name + " " + host.score + " - " + away.score + " " + away.name);
	}
	
	public static void printWhichTeam(FootballGame host, FootballGame away, int i){
		if (isHost[i] == true){
			System.out.print("GOAL !!! " + host.name);
			printWhichPlayer(host, away, i);
		} else if (times[i] == true) {
			System.out.print("GOAL !!! " + away.name);
			printWhichPlayer(host, away, i);
		}
		
	}
	
	static char[] x = new char[]{'G', 'G', 'G', 'G', 'G', 'G', 'A', 'A', ' ', ' ', ' ', ' '};
	public static void printWhichPlayer(FootballGame host, FootballGame away, int i){
		if ((host.name == "Fenerbahçe" && isHost[i] == true)||(away.name == "Fenerbahçe" && isHost[i] == false)){
			int r = randomNumber(0, 11);
			while (x[r] == '0'){
				r = randomNumber(0, 11);
			}
			System.out.print(" " + x[r]);
			x[r] = '0';
		}
	}
	
	public static void main(String[] args) {

		FootballGame fb = new FootballGame("Fenerbahçe", 20);
		FootballGame jv = new FootballGame("Juventus", 5);
		FootballGame bm = new FootballGame("Bayern", 7);
		FootballGame bc = new FootballGame("Barça", 9);
		FootballGame mc = new FootballGame("M. City", 11);
		
		FootballGame host = jv;
		FootballGame away = fb;
		goals(host, away);
		printScoreBoard(host, away);
		
	}

}
