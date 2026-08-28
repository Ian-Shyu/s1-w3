public class ClassroomMain {
    public static void main(String[] args) {
        Classroom c1 = new Classroom("John", 6, 20);
        Classroom c2 = new Classroom("Derrek");

        c2.setDesks(30);

        System.out.println("Teacher: " + c1.teacher());
        System.out.println("Desks: " + c1.students());
        System.out.println("Students: " + c1.students());



        
    }
}
