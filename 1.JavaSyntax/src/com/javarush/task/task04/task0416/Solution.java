

/* 
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader namber = new BufferedReader(new InputStreamReader(System.in));
        String time = namber.readLine();
        double t = Double.parseDouble(time);
        t = t % 5;
        if(t % 5 == 0)
            System.out.println("зелёный");
        if(t > 0.00 & t < 3.00)
            System.out.println("зелёный");
        else if(t >= 3.00 & t < 4.00 )
            System.out.println("жёлтый");
        else if(t >= 4.00 & t <= 5.00)
            System.out.println("красный");
    }
}