package exercise14;

public class TennisGame {
    public boolean tennisSet(int score1, int score2) {
        int winBelow5 = 6;
        int winAtOrAbove5 = 7;
        boolean tie = score1 == score2;
        int max = (score1 < score2) ? score2 : score1;
        int min = (score1 < score2) ? score1 : score2;
        return !tie && ((min < 5 && max == winBelow5) || (min >= 5 && max == winAtOrAbove5));
    }
}
