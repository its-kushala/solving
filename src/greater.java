import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner mynum = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int a = mynum.nextInt();
        int b = mynum.nextInt();

        if(a>b) {
            System.out.println(+a + " is greater number among both");
        }
            else
            {
                System.out.println(+b +" is the greater number among both");
            }
        }
    }
