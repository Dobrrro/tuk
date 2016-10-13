package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Пыльный on 11.10.2016.
 */
//есть 2 int переменные (значения от 0 до 9999),
// поменять их значения местами с помощью доп. переменной, сдвига, операции xor
public class Zadacha4
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c;

 //Третья переменная:
        c = a;   a = b;   b = c;
        System.out.println("После доп. переменной a = " + a);
        System.out.println("После доп. переменной a = " + b);

 //XOR:
        a=a^b;   b=a^b;   a=a^b;
        System.out.println("После XOR a = " + a);
        System.out.println("После XOR a = " + b);

    }
}
