public class odd_sum {
    public static void main(String[] args) {
        int n = 10;
        int sum = odd_sum(n);
        System.out.println("The sum of add numbers from 1 to "  +n+ " is:" +sum);
    }
    public static int  odd_sum(int n){
        int sum = 0;
        for(int i=1; i<=n; i+=2) {
            sum += i;
        }
        return sum;
    }
}
