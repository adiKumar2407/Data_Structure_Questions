import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int k = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while(num >0) {
            int lastDigit  = num % 10;
            sum  += (int) Math.pow(lastDigit,k);
            num /= 10 ;
        }
        System.out.println(sum == n ? true : false);
    }
}
