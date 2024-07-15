import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the values of a, b, c:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int average = ( a + b + c)/3;
        System.out.println("The average is:" +average);
    }
}