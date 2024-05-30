import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrintAllDivisors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> divisor = new ArrayList<>();
        int squareRoot = (int) Math.sqrt(n);
        for(int i = 1; i<= squareRoot; ++i) {
            if(n % i == 0) {
                divisor.add(i);

                if(i != n/i) {
                    divisor.add(n/i);
                }
            }
        }
        Collections.sort(divisor);
        System.out.println(divisor);
    }
}
