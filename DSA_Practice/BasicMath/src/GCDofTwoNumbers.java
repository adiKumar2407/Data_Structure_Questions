import java.util.Scanner;

public class GCDofTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number 1 = ");
        int numberOne = scanner.nextInt();

        System.out.print("Enter the number 2 = ");
        int numberTwo = scanner.nextInt();

        int gcd = 1;
        for(int i = 1; i < Math.min(numberOne , numberTwo) ; i++ ) {
            if (numberOne % i == 0 && numberTwo % i == 0){
                gcd = i ;
            }
        }
        System.out.println("Greatest common divisor is : "+ gcd);
    }
}
