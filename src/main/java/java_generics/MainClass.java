package java_generics;

public class MainClass {
    public static void main(String[] args) {
//        print Integer
        PrintInteger printInteger = new PrintInteger(15);
        System.out.println(printInteger.getInteger());

//        print Double
        PrintDouble printDouble = new PrintDouble(5.3);
        System.out.println(printDouble.getDouble());

//        print String
        PrintString printString = new PrintString("Java Learning");
        System.out.println(printString.getString());
    }
}
