package Java_1;

public class JavaOperators {
    public static void main(String[] args) {
//        Unary Operator
        System.out.println("Unary Operator...");
        int unaryOperator = 10;
        System.out.println(unaryOperator++); // 10
        System.out.println(++unaryOperator); // 12
        System.out.println(unaryOperator--); // 12
        System.out.println(--unaryOperator); // 10


//        Arithmetic Operator
        System.out.println("Arithmetic Operator...");
        int add = 10, sub = 5, mul = 3, div = 2;

//        Addition
        int summation = add + sub;
        System.out.println(summation); // 15

//        subtraction
        int subtraction = add - sub;
        System.out.println(subtraction); // 5

//        Multiplication
        int multiplication = add * mul;
        System.out.println(multiplication); // 30

//        Divide
        int divide = add / div;
        System.out.println(divide); // 5


//        Relational Operator
        System.out.println("Relational Operator...");
        int a = 10, b = 8;

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true


//        Logical Operator
        int x = 5, y = 10, z = 5;
        System.out.println("Logical Operator...");

//        AND Operations
        if (x == 5 && x == z)
        {
            System.out.println("Both conditions are TRUE");
        }

//        OR Operations
        if (y == 5 || y > x)
        {
            System.out.println("If one condition is true, then it will be executed");
        }

//        Ternary Operator
        System.out.println("Ternary Operator...");
        System.out.println((x > y) ? x : y);
        System.out.println((x < y) ? x : y);


    }
}
