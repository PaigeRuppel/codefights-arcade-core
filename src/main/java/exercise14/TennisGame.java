package exercise14;

public class TennisGame {
    public boolean tennisSet(int score1, int score2) {
        int max = (score1 < score2) ? score2 : score1;
        return Math.abs(score1 - score2) >= 3 && max < 7;
    }
}
