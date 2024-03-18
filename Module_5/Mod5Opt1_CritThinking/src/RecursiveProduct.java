import java.util.Scanner;

public class RecursiveProduct {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        double[] numbers = new double[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scnr.nextDouble();
        }

        double product = calculateProduct(numbers, 0);
        System.out.println("The product of the five numbers is: " + product);
        
        scnr.close();
    }

    public static double calculateProduct(double[] numbers, int index) {
        if (index == numbers.length - 1) {
            return numbers[index];
        } else {
            return numbers[index] * calculateProduct(numbers, index + 1);
        }
    }
}
