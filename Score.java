public class Score {
    private int score;
    
    public Score(){
        score = 50;
    }

    public Score(int s){
        score = s;
    }

    public void increaseScore(int amt){
        score += amt;
    }

    public void decreaseScore(int amt){
        score -= amt;
    }

    public int scoreCount(){
        return score;
    }




}
