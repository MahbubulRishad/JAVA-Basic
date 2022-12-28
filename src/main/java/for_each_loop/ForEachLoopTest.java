package for_each_loop;

public class ForEachLoopTest {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i);
        }

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        double[] amount = {10.1, 20.3, 30.5, 40.6, 50.1, 60.00, 70.66, 80.1, 90.6, 100.22};
        String[] names = {"Rishad", "Rifat", "Raka", "Rahat", "Rohan", "Rimon"};

//        printing number using for each loop
        for (int num : numbers) {
            System.out.println("Number is: " + num);
        }

//        printing String using for each loop
        for (String str : names) {
            System.out.println("Names are: " + str);
        }

//        Printing double value using For Each Loop
        for (double am : amount) {
            System.out.println("Amount is: " + am);
        }

    }
}
