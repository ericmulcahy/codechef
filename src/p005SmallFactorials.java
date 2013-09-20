import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * FCTRL2
 *
 You are asked to calculate factorials of some small positive integers.
 Input


 An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.
 Output


 For each integer n given at input, display a line with the value of n!
 Example

 Sample input:
 4
 1
 2
 5
 3
 Sample output:
 1
 2
 120
 6
 * Created on 9/20/13 at 1:20 PM by @author emulcahy
 */
public class p005SmallFactorials {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            Integer t = Integer.parseInt(line);

            for (int i=0; i<t; i++) {
                Integer num = Integer.parseInt(br.readLine());
                BigInteger product = BigInteger.ONE;
                for (int j=2; j<=num; j++) {
                    BigInteger jj = new BigInteger(Integer.toString(j));
                    product = product.multiply(jj);
                }
                System.out.println(product);
            }
        } catch (IOException e) { /*ignore*/ }
    }
}
