import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int second = scanner.nextInt();

        int result = calculateGCD(first, second );
        System.out.println("The GCD of " +first + "and " +second + " numbers is: " +result);

        scanner.close();
    }
    public static int calculateGCD(int first, int second){
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }
}
