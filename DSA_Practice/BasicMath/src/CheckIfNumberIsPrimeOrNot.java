import java.util.Scanner;

public class CheckIfNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for(int i = 1; i<= Math.sqrt(n); i++) {
            if(n % i == 0) {
                count += 1;

                if (n / i != i){
                    count += 1;
                }
            }
        }
        System.out.println(count == 2);
    }
}
