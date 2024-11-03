package deneme;

public class Team {
    private final String name;
    private final double goalsForPerMatch;
    private final double goalsAgainstPerMatch;
    private int score;

    public String getName() {
        return name;
    }

    public double getGoalsForPerMatch() {
        return goalsForPerMatch;
    }

    public double getGoalsAgainstPerMatch() {
        return goalsAgainstPerMatch;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Team(String name, double goalsForPerMatch, double goalsAgainstPerMatch){
        this.name = name;
        this.goalsForPerMatch = goalsForPerMatch;
        this.goalsAgainstPerMatch = goalsAgainstPerMatch;
        this.score = 0;
    }
}
