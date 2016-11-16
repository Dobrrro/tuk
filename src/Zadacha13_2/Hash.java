package Zadacha13_2;

import java.util.Set;

/**
 * Created by Пыльный on 17.11.2016.
 */
public class Hash {
    public static long addValueHashSet(int m, Set<Integer> collections){
        long start = System.currentTimeMillis();
        collections.add(m);
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
    public static long getHashSet (int n, Set<Integer> collections) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            collections.contains(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
    private static long removeHashSet(int n, Set<Integer> collections){
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++){
            collections.remove(i);
        }
        long finish = System.currentTimeMillis();
        long result;
        return result = finish - start;
    }
    }
