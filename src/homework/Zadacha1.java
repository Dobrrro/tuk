package homework;

import com.sun.org.apache.xpath.internal.SourceTree;
import sun.java2d.cmm.lcms.LCMS;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Пыльный on 11.10.2016.
 */
//найти наименьшее общее кратное и наибольший общий делитель числа, вводимого с консоли
public class Zadacha1 
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
               System.out.println("Наибольший общий делитель = " + сommonDivider(a,b));
               System.out.println("Наименьшее общее кратное = " + lcm(a, b));
    }

    private static int сommonDivider(int a, int b)
    {
        int commonDivider = 1;
        for(int i = 1;i<(a<b ? a:b); i++)
        {
            if ((a%i==0)&&(b%i==0))
                commonDivider=i;
        }
        return commonDivider;
    }
    private static int lcm(int a, int b)
    {
        return a / сommonDivider(a,b) * b;
    }

}
