import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double r = radius.nextDouble();
        double C = 2 * 3.14 * r;
        System.out.println("The circumference of the circle is:" +C);

    }
}
