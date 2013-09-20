import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
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
