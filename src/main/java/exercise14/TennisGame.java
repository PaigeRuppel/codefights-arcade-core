package exercise14;

public class TennisGame {
    public boolean tennisSet(int score1, int score2) {
        boolean tie = score1 == score2;
        int winBelow5 = 6;
        int winAtOrAbove5 = 7;
        int max = (score1 < score2) ? score2 : score1;
        int min = (score1 < score2) ? score1 : score2;
        boolean matchRule = (min < 5) ? max == winBelow5 : max == winAtOrAbove5;
        return !tie && matchRule;
    }
}
