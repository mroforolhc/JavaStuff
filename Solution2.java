/* Числа Фибоначчи от 1 до N */

import java.io.*;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(buff.readLine());

        long now = 1;
        int count = 1;
        Fib f = new Fib();
        while (now <= n) {
            System.out.print(now + " ");
            now = f.req(count);
            count++;
        }


    }
}

class Fib {
    long req(long n) {
        if (n == 1) return 1;
        if (n == 2) return 1;

        return req(n-1)+req(n-2);
    }
}
