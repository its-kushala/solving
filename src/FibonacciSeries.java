import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Print Fibonacci series up to n terms
        printFibonacciSeries(n);

        scanner.close();
    }

    // Function to print Fibonacci series up to n terms
    public static void printFibonacciSeries(int n) {
        if (n <= 0) {
            System.out.println("The number of terms should be a positive integer.");
            return;
        }

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.print("Fibonacci Series: " + firstTerm);

        if (n > 1) {
            System.out.print(", " + secondTerm);
        }

        for (int i = 3; i <= n; i++) {
            long nextTerm = firstTerm + secondTerm;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}
