import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * http://www.codechef.com/problems/TSORT
 *
 Given the list of numbers, you are to sort them in non decreasing order.
 Input

 t – the number of numbers in list, then t lines follow [t <= 10^6].

 Each line contains one integer: N [0 <= N <= 10^6]
 Output

 Output given numbers in non decreasing order.
 Example

 Input:
 5
 5
 3
 6
 7
 1
 Output:
 1
 3
 5
 6
 7

 * Created on 9/20/13 at 1:45 PM by @author emulcahy
 */
public class p007TSORT {
    //Note: Integer was too slow, I had to use primitives to get this to complete within the time limit
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1048576);
            String line = br.readLine();

            int t = Integer.parseInt(line);

            int[] numArray = new int[t];

            for (int i=0; i<t; i++) {
                numArray[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(numArray);

            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out), 1048576));
            for (int i : numArray) {
                out.println(i);
            }
            out.flush();
            out.close();
        } catch (IOException e) { /*ignore*/ }
    }
}
