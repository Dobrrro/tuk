package Zadacha11.service.model;

/**
 * Created by Пыльный on 02.11.2016.
 */
import java.util.Arrays;
import java.util.List;

public class SmartMonkey extends AbstractMonkey {

    private final List<String> TYPES = Arrays.asList("COCOS", "BANANA");

    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return TYPES.contains(fruit.getType().name());
    }
}