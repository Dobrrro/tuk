package Zadacha13_2;

import java.util.List;

/**
 * Created by Пыльный on 17.11.2016.
 */
public class Linked {
    public static long addValue (int index, int m,List<Integer> collections){
        long start = System.currentTimeMillis();
        collections.add(index, m);
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
}
