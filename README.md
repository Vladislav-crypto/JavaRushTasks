# JavaRushTasks
Некоторые решения
package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int a;
        int sum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            a = Integer.parseInt(reader.readLine());
            sum += a;
            if (a == -1)
            {
                break;
            }
        }
        System.out.println(sum);
        }
    }
}
