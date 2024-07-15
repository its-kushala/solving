import java.util.Scanner;

public class bigsum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        while (true) {
            System.out.println("Enter the numbers :");
            if (num.hasNextLong()) {
                long numb = num.nextLong();
                if (numb > 0) {
                    positiveCount++;
                } else if (numb < 0) {
                    negativeCount++;
                } else {
                    zeroCount++;
                }
            } else {
                break;
            }
        }
        System.out.println("Count of positive numbers: " + positiveCount);
        System.out.println("Count of negative numbers: " + negativeCount);
        System.out.println("Count of zeros: " + zeroCount);

        num.close();
    }
}
