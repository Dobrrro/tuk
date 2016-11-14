package Zadacha11.service.model;

/**
 * Created by Пыльный on 02.11.2016.
 */
public class CocosMonkey extends AbstractMonkey{

    private final String TYPE = "COCOS";

    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return TYPE.equals(fruit.getType().name());
    }
}