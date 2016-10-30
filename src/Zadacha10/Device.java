package Zadacha10;

/**
 * Created by Пыльный on 27.10.2016.
 */
public abstract class Device extends act implements Metods {
    String producer;
    int price;

    Device(String producer, int price) {
        this.producer = producer;
        this.price = price;
    }

    abstract Category getCategory();
}
