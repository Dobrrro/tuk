package homework;

/**
 * Created by Пыльный on 23.10.2016.
 */

//          МЕТОД 1, РАСКОМПЕЛИРОВАТЬ:

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}

//          МЕТОД 2, РАСКОМПЕЛИРОВАТЬ:

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

//          МЕТОД 3 с ленивой загрузкой, РАСКОМПЕЛИРОВАТЬ:

//public class Singleton {
//    public static IntToIntPixelConverter getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = (IntToIntPixelConverter) new Singleton();
//                }
//            }                 //Вот тут не понимаю почему подчеркивает instance, но кучу сайтов перерыл
//        }                     //должно быть правильно.
//        return instance;
//    }
//}

//          МЕТОД 4 через enum, РАСКОМПЕЛИРОВАТЬ:

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