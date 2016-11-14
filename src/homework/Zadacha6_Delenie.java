package homework;

import static java.lang.StrictMath.pow;

/**
 * Created by Пыльный on 24.10.2016.
 */


//написать метод, который разделит одно число на другое не используя оператор деления. предусмотреть все возможные ошибки
public class Zadacha6_Delenie
    {

        public static void main(String[] args)
        {
            System.out.println(del(72, -16));
        }

    private static double del(double a, double b) {

        return a * pow(b, -1);
    }
}