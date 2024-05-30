import java.util.Scanner;

public class NumberIsPalindromeOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int reverseNumber = 0;
        int duplicate = n;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            n /= 10;
        }
        if (duplicate == reverseNumber) {
            System.out.println(reverseNumber + " is Palindrome");
        }
        else {
            System.out.println(reverseNumber +" is not a Palindrome " );
        }
        scanner.close();
    }
}
