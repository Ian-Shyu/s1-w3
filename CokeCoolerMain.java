public class CokeCoolerMain{
    public static void main(String[] args){
        CokeCooler c1 = new CokeCooler();
        CokeCooler c2 = new CokeCooler(30);

        c1.drink(40);
        c1.refill(20);

        c2.drink(50);
        c2.refill(30);

        System.out.println(c1.cokeCount());
        System.out.println(c2.cokeCount());

    }

}