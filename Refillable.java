public class Refillable {
    private int amount;
    private int totalUsed;
    private int totalTimeUsedHappens;


    public Refillable(){
        amount = 10;
    }

    public Refillable(int a){
        amount = a; 
    }
    
    public void useUp(int amt){
        amount -= amt;
        totalUsed += amt;
        totalTimeUsedHappens ++; 
    }

    public void addTo(int amt){
        amount += amt;
    }

    public double averageUse(){
        return 1.0 * totalUsed / totalTimeUsedHappens;
    }
    
    public int refillableCount(){
        return amount;
    }

}
