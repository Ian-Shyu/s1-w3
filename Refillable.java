public class Refillable {
    private int amount;

    public Refillable(){
        amount = 10;
    }

    public Refillable(int a){
        amount = a; 
    }
    
    public void useUp(int amt){
        amount -= amt; 
    }

    public void addTo(int amt){
        amount += amt;
    }

    public int refillableCount(){
        return amount;
    }

}
