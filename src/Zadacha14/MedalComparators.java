package Zadacha14;

import java.util.Comparator;

/**
 * Created by Пыльный on 14.11.2016.
 */
public class MedalComparators implements Comparator<Sportsman> {

    public int compare (Sportsman a, Sportsman b){
        return b.getMedals() - a.getMedals();
    }
}