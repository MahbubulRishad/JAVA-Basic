package for_each_loop;

public class ForEachLoopTest {
    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.out.println("Number: " + i);
        }

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        String[] names = {"Rishad", "Rifat", "Raka", "Rahat", "Rohan", "Rimon"};

//        printing number using for each loop
        for (int num : numbers) {
            System.out.println("Number is: " + num);
        }

//        printing String using for each loop
        for (String str : names) {
            System.out.println("Names are: " + str);
        }
    }
}
