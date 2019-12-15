

/* 
Минимум двух чисел
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a  = Integer.parseInt(reader.readLine());
        int b  = Integer.parseInt(reader.readLine());
        int c  = Integer.parseInt(reader.readLine());
        int d  = Integer.parseInt(reader.readLine());

        System.out.println(a >= b && a >= c && a >= d ? a : b >= a && b >= c && b >= d ? b : c >= a && c >= b && c >= d ? c : d);



    }
}