package Zadacha13_2;

import java.util.Collection;
import java.util.List;

/**
 * Created by Пыльный on 17.11.2016.
 */
public class Array {


    public static long addArray(int n, Collection<Integer> collections) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            collections.add(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
    public static long get (int n, List<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.get(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
    public static long remove(int n, List<Integer> collections){
        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++){
            collections.remove(0);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
}