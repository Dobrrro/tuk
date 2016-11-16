package Zadacha13_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import static Zadacha13_2.Array.addArray;
import static Zadacha13_2.Array.remove;
import static Zadacha13_2.Hash.addValueHashSet;
import static Zadacha13_2.Linked.addValue;
import static Zadacha13_2.time.compare;
import static java.util.Collections.get;

/**
 * Created by Пыльный on 17.11.2016.
 */
public class main {
    private static int n = 100000;
    private static int m = 120000;
    static int index = 50000;

    public static void print(long array, long linked, long hashSet) {
        System.out.println("Time ArrayList is " + array + " miliseconds");
        System.out.println("Time LinkedList is " + linked + " miliseconds");
        System.out.println("Time HashSet is " + hashSet + " miliseconds");
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();

        System.out.println("Check ADD array");
        long resultAddArrayList = addArray(n, arrayList);
        long resultAddLinkedList = addArray(n, linkedList);
        long resultAddHashSet = addArray(n, hashSet);
        print(resultAddArrayList, resultAddLinkedList, resultAddHashSet);
        compare(resultAddArrayList, resultAddLinkedList, resultAddHashSet, "ADD array");
        System.out.println();


        System.out.println("Check ADD one value in exact index");
        long resultAddValueArrayList = addValue(index, m, arrayList);
        long resultAddValueLinkedList = addValue(index, m, linkedList);
        long resultAddValueHashSet = addValueHashSet(m, hashSet);
        print(resultAddValueArrayList, resultAddValueLinkedList, resultAddValueHashSet);
        compare(resultAddValueArrayList, resultAddValueLinkedList, resultAddValueHashSet, "ADD ONE VALUE");
        System.out.println();

        System.out.println("Check GET array");
        long getArrayList = get(n, arrayList);
        long getLinkedList = get(n, linkedList);
        long getHashSet = getHashSet(n, hashSet);
        print(getArrayList, getLinkedList, getHashSet);
        compare(getArrayList, getLinkedList, getHashSet, "GET array");
        System.out.println();

        System.out.println("Check REMOVE array");
        long removeArrayList = remove(n, arrayList);
        long removeLinkedList = remove(n, linkedList);
        long removeHashSet = removeHashSet(n, hashSet);
        print(removeArrayList, removeLinkedList, removeHashSet);
        compare(removeArrayList, removeLinkedList, removeHashSet, "REMOVE array");
        System.out.println();

        System.out.println("Last element");
        for (int element : arrayList) {
            System.out.println("in ArrayList is " + element);
        }
        for (int element : linkedList) {
            System.out.println("in LinkedList is " + element);
        }
        for (int element : hashSet) {
            System.out.println("in HashSet is " + element);
        }
    }




}
