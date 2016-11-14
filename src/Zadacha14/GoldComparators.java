package Zadacha14;

import java.util.Comparator;

/**
 * Created by Пыльный on 14.11.2016.
 */
public class GoldComparators implements Comparator<Sportsman> {

    public int compare (Sportsman a, Sportsman b){
        return b.gold - a.gold;
    }
}
