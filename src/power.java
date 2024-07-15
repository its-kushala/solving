import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of base number x :");
        double x = scanner.nextDouble();

        System.out.println("Enter the value of exponent n : ");
        int n = scanner.nextInt();

        double result = value(x, n);
        System.out.println("The final result is:" +result);
        scanner.close();
    }
    public static double value(double x, int n){
        return Math.pow(x, n);
    }
}
