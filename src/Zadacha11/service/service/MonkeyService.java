package Zadacha11.service.service;

/**
 * Created by Пыльный on 02.11.2016.
 */

import Zadacha11.service.model.BananaMonkey;
import Zadacha11.service.model.Branch;
import Zadacha11.service.model.Calculation;
import Zadacha11.service.model.CocosMonkey;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by StudentTC on 01.11.2016.
 */
public class MonkeyService {
    private static Random random = new Random();

    public static void main(String[] args) {
        Branch tree = createTree(FruitType.COCOS.name());
        Branch tree2 = createTree(FruitType.BANANA.name());
        Branch tree3 = createTree(FruitType.BANANA.COCOS.name());

        Calculation monkey = new CocosMonkey();
        Calculation monkey2 = new BananaMonkey();
        Calculation monkey3 = new BananaMonkey();

        calculate(monkey, tree);
        calculate(monkey2, tree2);
        calculate(monkey3, tree3);

        System.out.println("CocosMonkey насчитала "+monkey.getNumberOfFruits()+" кокосов");
        System.out.println("BananaMonkey насчитала "+monkey2.getNumberOfFruits()+" бананов");
        System.out.println("SmartMonkey насчитала "+monkey3.getNumberOfFruits()+" фруктов");
    }

    public static int calculate(Calculation monkey, Branch tree) {
        return monkey.calculate(tree);
    }

    public static Branch createTree(String type) {
        Branch tree = new Branch();
        Branch tree2 = new Branch();
        List<Branch> children = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            Branch child = createTree(new Branch(), type);
            children.add(child);
        }
        tree.setBranches(children);

        return tree;
    }

    public static Branch createTree(Branch tree, String type) {
        List<Branch> children = new ArrayList<>();

        for (int i = 0; i < random.nextInt(9); i++) {
            Branch child = new Branch();
            child.populateBranch(FruitType.COCOS.name(), 1);
            children.add(child);
        }
        tree.setBranches(children);
        tree.populateBranch(FruitType.COCOS.name(), 0);

        return tree;
    }

    public enum FruitType {
        COCOS,
        BANANA
    }
}