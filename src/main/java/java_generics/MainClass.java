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

        System.out.println("-----Generic Start-----");

//    Generic Start (Print Integer)
        GenericStart <Integer> integerGenericStart = new GenericStart<>(50);
        System.out.print("Integer No: ");
        System.out.println(integerGenericStart.getObj());

//        Generic Start (Print String)
        GenericStart <String> stringGenericStart = new GenericStart<>("String from Generic start class");
        System.out.print("String: ");
        System.out.println(stringGenericStart.getObj());

//        Generic Start (print Double)
        GenericStart <Double> doubleGenericStart = new GenericStart<>(56.3);
        System.out.print("Double No: ");
        System.out.println(doubleGenericStart.getObj());
    }
}
