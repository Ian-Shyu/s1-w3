public class CandyJarMain{
    public static void main(String[] args){
        CandyJar c1 = new CandyJar();
        CandyJar c2 = new CandyJar(20);

        c1.eat(5);
        c1.refill(7);

        c2.eat(12);
        c2.refill(3);

        c1.printState();
        c2.printState();
    }

}