public class ScoreMain{
    public static void main(String[] args){
        Score s1 = new Score();
        System.out.println(s1.scoreCount());

        Score s2 = new Score(10);
        s2.increaseScore(50);
        s2.decreaseScore(20);
        System.out.println("Score: " + s2.scoreCount()); 
    }
}