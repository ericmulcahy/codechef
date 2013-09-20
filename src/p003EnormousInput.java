import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 INTEST

 The purpose of this problem is to verify whether the method you are using to read input data is sufficiently fast
 to handle problems branded with the enormous Input/Output warning. You are expected to be able to process at least
 2.5MB of input data per second at runtime.

 Input

 The input begins with two positive integers n k (n, k<=10^7). The next n lines of input contain one positive integer ti, not greater than 10^9, each.
 Output

 Write a single integer to output, denoting how many integers ti are divisible by k.
 Example

 Input:
 7 3
 1
 51
 966369
 7
 9
 999996
 11

 Output:
 4
 * Created on 9/20/13 at 11:19 AM by @author emulcahy
 */
public class p003EnormousInput {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] splitLine = line.split(" ");
            Integer n = Integer.parseInt(splitLine[0]);
            Integer k = Integer.parseInt(splitLine[1]);
            int numDivisible = 0;

            for (int i=0; i<n; i++) {
                Integer data = Integer.parseInt(br.readLine());
                if (data % k == 0) {
                    numDivisible++;
                }
            }
            System.out.println(numDivisible);
        } catch (IOException e) {
            //ignore
        }
    }
}
