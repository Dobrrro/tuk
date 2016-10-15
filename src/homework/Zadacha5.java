package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Пыльный on 14.10.2016.
 */
public class Zadacha5
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] mas = new int[Integer.parseInt(reader.readLine())];
        int b = mas.length/2;

        for (int i=1; i <=mas.length; i++)
        {
            if (i>b) continue;
            for (int j = 1; j <=mas.length; j++)
            {
                if (j<=i || j>mas.length-i) System.out.print("X");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
        for (int i=b+1; i <=mas.length; i++)
        {
            for (int j = 1; j <=mas.length; j++)
            {
                if (j>=i) System.out.print("X");
                else if (j<mas.length-i+2) System.out.print("X");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}


//public class Zadacha5  //при помощи переменной:
//{
//    public static void main(String[] args) throws Exception
//    {
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(reader.readLine());
//        int b = a/2+1;
//
//        for (int i=1; i <= a; i++)
//        {
//            if (i>b) continue;
//            for (int j = 1; j <= a; j++)
//            {
//                if (j<=i || j>a-i) System.out.print("X");
//                else System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
//        for (int i=b+1; i <= a; i++)
//        {
//            for (int j = 1; j <= a; j++)
//            {
//                if (j>=i) System.out.print("X");
//                else if (j<a-i+2) System.out.print("X");
//                else System.out.print(" ");
//            }
//            System.out.print("\n");
//        }
//
//
//    }
//}
