public class RefillableMain {
    public static void main(String[] args){
        Refillable r1 = new Refillable(25);
        r1.useUp(20);
        r1.addTo(200);
        System.out.println("Refillable: " + r1.refillableCount());

        r1.useUp(10);
        r1.useUp(13);
        r1.useUp(15);
        r1.useUp(25);
        r1.useUp(32);
        r1.useUp(12);
        r1.useUp(32);
        r1.useUp(21);

        System.out.println("Average Use: " + r1.averageUse());
    }
}
