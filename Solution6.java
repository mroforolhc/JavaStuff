/* Удаление циферок */

import java.io.*;

public class Solution6 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String s = buff.readLine();

        s = s.replaceAll("\\d","");
        System.out.print(s);
    }
}
