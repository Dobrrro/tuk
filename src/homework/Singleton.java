package homework;

/**
 * Created by Пыльный on 23.10.2016.
 */

//          МЕТОД 1, РАСКОМПЕЛИРОВАТЬ:

//public class Singleton {
//
//    private static Singleton instance = new Singleton();
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}

//          МЕТОД 2 с ленивой загрузкой, РАСКОМПЕЛИРОВАТЬ:

//public class Singleton {
//    private static Singleton instance;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInsance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}



//          МЕТОД 3 через enum, РАСКОМПЕЛИРОВАТЬ:

//public enum Singleton {
//    INSTANCE;
//
//    private Singleton() {
//    }
//
//    public static Singleton getInstance(){
//        return INSTANCE;
//    }
//}