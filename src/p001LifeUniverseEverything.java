//TEST

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p001LifeUniverseEverything {
    public static void main(String[] args) {
        Integer i = -1;

        List<Integer> nums = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                i = Integer.parseInt(br.readLine());
                if (i == 42) {
                    break;
                } else {
                    nums.add(i);
                }
            } catch (IOException e) {
                //
            }
        }
        for (Integer x : nums) {
            System.out.println(x);
        }
    }
}
