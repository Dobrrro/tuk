package Zadacha11.service.model;

/**
 * Created by Пыльный on 02.11.2016.
 */

import static Zadacha11.service.service.MonkeyService.FruitType;

public class Fruit {
    private final FruitType type;

    public Fruit(String type) {
        this.type = FruitType.valueOf(type);
    }

    public FruitType getType() {
        return type;
    }
}