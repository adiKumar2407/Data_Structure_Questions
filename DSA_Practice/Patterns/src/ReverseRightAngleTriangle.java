import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseRightAngleTriangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int nStars = n;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= nStars; j++) {
                System.out.print("*\t");
            }
            nStars--;
            System.out.println();
        }

    }
}
