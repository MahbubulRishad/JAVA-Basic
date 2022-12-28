package Java_1;

public class JavaVariable {

    //  Instance variable
    String name = "Mr.PQR";

    //    Static variable
    static int minAge = 20;

    //     local variable
    public void sum ()
    {
        int a = 10, b = 15, sum = 0;
        sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        JavaVariable javaVariable = new JavaVariable();

        System.out.println(javaVariable.name);
        System.out.println(JavaVariable.minAge);
        javaVariable.sum();
    }

}
