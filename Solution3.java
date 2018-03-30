/* Пересечение отрезков */

import java.io.*;

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        float[] oneLine = new float[4];
        float[] twoLine = new float[4];

        System.out.print("Введите x1,y1,x2,y2 первого отрезка: ");
        String[] sLine = buff.readLine().split(" ");
        for (int i = 0; i < sLine.length; i++) oneLine[i] = Integer.parseInt(sLine[i]);

        System.out.print("Введите x1,y1,x2,y2 второго отрезка: ");
        sLine = buff.readLine().split(" ");
        for (int i = 0; i < sLine.length; i++) twoLine[i] = Integer.parseInt(sLine[i]);

        float v1 = (twoLine[2]-twoLine[0])*(oneLine[1]-twoLine[1]) - (twoLine[3]-twoLine[1])*(oneLine[0]-twoLine[0]);
        float v2 = (twoLine[2]-twoLine[0])*(oneLine[3]-twoLine[1]) - (twoLine[3]-twoLine[1])*(oneLine[2]-twoLine[0]);
        float v3 = (oneLine[2]-oneLine[0])*(twoLine[1]-oneLine[1]) - (oneLine[3]-oneLine[1])*(twoLine[0]-oneLine[0]);
        float v4 = (oneLine[2]-oneLine[0])*(twoLine[3]-oneLine[1]) - (oneLine[3]-oneLine[1])*(twoLine[2]-oneLine[0]);

        if ((v1 * v2 < 0) && (v3 * v4 < 0)) System.out.print("Пересекаются");
        else System.out.print("Не пересекаются");

    }
}