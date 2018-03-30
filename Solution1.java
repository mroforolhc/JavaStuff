/* Простые числа от 1 до N */

import java.io.*;
import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());

        boolean[] simple = new boolean[n + 1];
        Arrays.fill(simple, true);
        simple[0] = false;
        simple[1] = false;

        for (int i = 2; i < n; i++) {
            if (simple[i]) {
                for (int j = 2; i*j < n; j++) {
                    simple[i*j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (simple[i]) System.out.print(i + " ");
        }
    }
}
