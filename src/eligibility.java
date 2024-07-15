import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Enter the Age:");
        int urage = age.nextInt();
        if(urage>18){
            System.out.println("You are Eligible for Voting");
        }
        else {
            System.out.println("You are not Eligible for Voting");
        }
    }
}
