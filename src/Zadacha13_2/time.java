package Zadacha13_2;

/**
 * Created by Пыльный on 17.11.2016.
 */
public class time {

//    public static long Starttime() {
//        long start = System.currentTimeMillis();
//        return start;
//    }
//    public long Finish() {
//        long finish = System.currentTimeMillis();
//        return finish;
//    }
//    public long Result() {
//        result = finish - start;
//        this.result = result;
//    }

//    long start = System.currentTimeMillis();
//    long finish = System.currentTimeMillis();
//    long result;
//        return result = finish - start;

    public static void compare (long array, long linked, long hashSet, String type){
        if (array<linked && array<hashSet){
            System.out.println("Command " + type + " faster in ArrayList");
        }
        else if (linked<hashSet){
            System.out.println("Command " + type + " faster in LinkedList");
        }
        else System.out.println("Command " + type + " faster in HashSet");
    }


}
