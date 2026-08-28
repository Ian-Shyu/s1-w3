public class RefillableMain {
    public static void main(String[] args){
        Refillable r1 = new Refillable(25);
        r1.useUp(20);
        r1.addTo(30);
        System.out.println("Refillable: " + r1.refillableCount());
    }
}
