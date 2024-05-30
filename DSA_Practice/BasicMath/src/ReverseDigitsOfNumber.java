import java.util.Scanner;

public class ReverseDigitsOfNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int reverseNumber = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            reverseNumber = (reverseNumber * 10 ) + lastDigit;
            n /= 10;
        }
        System.out.println(reverseNumber);
        scanner.close();
    }
}
