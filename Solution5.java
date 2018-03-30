/* Палиндромы */

import java.io.*;

public class Solution5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();

        s = s.replaceAll("(?U)\\W","");
        StringBuilder strBuilder = new StringBuilder(s);
        strBuilder.reverse();
        String s2 = strBuilder.toString();

        if (s.equalsIgnoreCase(s2)) System.out.print("Эта строка - палиндром");
        else System.out.print("Это строка - не палиндром");
    }
}
