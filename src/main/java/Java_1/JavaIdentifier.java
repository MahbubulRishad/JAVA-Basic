package Java_1;

public class JavaIdentifier {

    String name;

    public void printName(String name)
    {
        this.name = name;
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        String name = "Mr. XYZ";
//        System.out.println(name);

        int age = 10;
        System.out.println(age);

        double salary = 1000.00;
        System.out.println(salary);

        float bonus = 500;
        System.out.println(bonus);

        long c = 10000000;
        System.out.println(c);
    }
}
