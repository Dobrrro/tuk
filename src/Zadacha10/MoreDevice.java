package Zadacha10;

/**
 * Created by Пыльный on 27.10.2016.
 */
public class MoreDevice extends Device implements Metods {
    public String name;
    MoreDevice(String producer, int price, String name) {
        super(producer, price);
        this.name = name;
    }

    @Override
    public void getPrice() {
        System.out.println("Этот "+name+" стоит "+this.price+" БАКСОВ!!!");
    }

    @Override
    public void getProducer() {
        System.out.println("Этот "+name+" сделали в компании "+this.producer);

    }

    @Override
    Category getCategory() {
        return null;
    }

    public static void main(String[] args) {

        Device telephone = new MoreDevice("Apple",1500,"AiPhone");
        String name = MoreDevice.class.getSimpleName();
        Device pleer = new MoreDevice("Sony",30,"Audiopleer");
        telephone.swichOn();
        telephone.swichOff();
        telephone.getCategory();
        telephone.getPrice();
        telephone.getProducer();
        pleer.swichOn();
        pleer.swichOff();
        pleer.getCategory();
        pleer.getPrice();
        pleer.getProducer();

    }
}
