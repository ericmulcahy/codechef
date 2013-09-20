import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * HOLES
 *
 Chef wrote some text on a piece of paper and now he wants to know how many holes are in the text. What is a hole?
 If you think of the paper as the plane and a letter as a curve on the plane, then each letter divides the plane
 into regions. For example letters "A", "D", "O", "P", "R" divide the plane into two regions so we say these letters
 each have one hole. Similarly, letter "B" has two holes and letters such as "C", "E", "F", "K" have no holes.
 We say that the number of holes in the text is equal to the total number of holes in the letters of the text.
 Help Chef to determine how many holes are in the text.

 Input
 The first line contains a single integer T <= 40, the number of test cases. T test cases follow.
 The only line of each test case contains a non-empty text composed only of uppercase letters of English alphabet.
 The length of the text is less then 100. There are no any spaces in the input.

 Output
 For each test case, output a single line containing the number of holes in the corresponding text.
 Example

 Input:
 2
 CODECHEF
 DRINKEATCODE

 Output:
 2
 5
 * Created on 9/20/13 at 1:35 PM by @author emulcahy
 */
public class p006HolesInTheText {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            Integer t = Integer.parseInt(line);

            for (int i=0; i<t; i++) {
                String input = br.readLine();
                int holes = 0;
                for (char c : input.toCharArray()) {
                    if (c == 'A' || c == 'D' || c == 'O' || c == 'P' || c == 'R' || c == 'Q') {
                        holes++;
                    } else if (c == 'B') {
                        holes += 2;
                    }
                }
                System.out.println(holes);
            }
        } catch (IOException e) { /*ignore*/ }
    }
}
