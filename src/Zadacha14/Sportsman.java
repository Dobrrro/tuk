package Zadacha14;

import java.util.TreeSet;

/**
 * Created by Пыльный on 14.11.2016.
 */
public class Sportsman {
    String name;
    int gold;
    int silver;
    int bronze;
    int age;

    Sportsman (String name, int gold, int silver, int bronze, int age) {
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.age = age;
    }

    public int getMedals (){
        return gold + silver + bronze;
    }


    public static void main(String[] args) {

        Sportsman[] team = new Sportsman[10];
        team [0] = new Sportsman("Жека",13, 24, 19, 23);
        team [1] = new Sportsman("Синий", 7, 9, 15, 18);
        team [2] = new Sportsman("Кирпич", 15, 3, 16,  22);
        team [3] = new Sportsman("Лысый", 12, 34, 17, 31);
        team [4] = new Sportsman("Кирил", 4, 6, 8, 30);
        team [5] = new Sportsman("Борода", 5, 12, 2, 18);
        team [6] = new Sportsman("Шнырь", 12, 6, 2, 24);
        team [7] = new Sportsman("Тема 6 пальцев", 7, 24, 8, 26);
        team [8] = new Sportsman("Вороной", 22, 13, 4, 27);
        team [9] = new Sportsman("ЛЮБАША", 55, 66, 0, 97);

        TreeSet<Sportsman> sportsman = new TreeSet<Sportsman>((new MedalComparators()).thenComparing(new NameComparator()));

        for (Sportsman element : team){
            sportsman.add(element);
        }

        for (Sportsman element : sportsman){
            System.out.println(element.getMedals()+" медалей надыбал(а) " + element.name);
        }
        System.out.println();



        TreeSet <Sportsman> sportsman2 = new TreeSet<Sportsman>((new GoldComparators()).thenComparing(new NameComparator()));

        for (Sportsman element : team){
            sportsman2.add(element);
        }

        for (Sportsman element : sportsman2){
            System.out.println(element.gold+" золотых меедалей у " + element.name);
        }
        System.out.println();



        TreeSet<Sportsman> sportsman3 = new TreeSet<Sportsman>((new AgeComparator()).thenComparing(new NameComparator()));

        for (Sportsman element : team){
            sportsman3.add(element);
        }

        for (Sportsman element : sportsman3){
            System.out.println(element.age+" годиков " + element.name);
        }



    }
}