import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OppRightAngleTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int nSpace = n-1;
        int nStars = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nSpace; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nStars; j++) {
                System.out.print("*\t");
            }
            nSpace--;
            nStars++;
            System.out.println();
        }
    }
}
