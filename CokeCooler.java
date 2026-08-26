public class CokeCooler {
    private int cokes;

    public CokeCooler(int a){
        cokes = a; 
    }

    public CokeCooler(){
        cokes = 100;
    }

    public void drink(int amt){
        cokes -= amt;
    }

    public void refill(int amt){
        cokes += amt;
    }

    public int cokeCount(){
        return cokes; 
    }
}
