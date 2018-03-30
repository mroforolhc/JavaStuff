/* НОД и НОК для 2 чисел */

import java.io.*;

public class Solution4 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        long one = Long.parseLong(buff.readLine());
        long two = Long.parseLong(buff.readLine());

        Algorithm algo = new Algorithm();
        System.out.println("НОД = " + algo.gcd(one, two));
        System.out.println("НОК = " + algo.lcm(one, two));

    }
}


class Algorithm {
    long gcd(long one, long two) {
        if (two == 0) return one;
        else return gcd(two, one % two);
    }

    long lcm(long one, long two) {
        return one / gcd(one, two) * two;
    }
}