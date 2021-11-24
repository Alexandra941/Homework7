package kalashnikova;

import java.util.Arrays;
import java.util.Random;

/**
 * Homework 7
 * @author Kalashnikova Aleksandra
 * @version 24.11.2021
 */
public class Homework7 {

    static Plate plate = new Plate(45);

    public static void main(String[] args) {
        System.out.println(plate.amountInfo());

        Cat[] cats = new Cat[] {
                new Cat(15),
                new Cat(11),
                new Cat(7),
                new Cat(8),
                new Cat(15),
                new Cat(6)
        };

        for (Cat cat : cats) {
            eat(cat);
        }

        int hungryCatCount = printFeedingInformation(cats, true);

        if(hungryCatCount == 0) {
            return;
        }

        int addFoodAmount = new Random().nextInt(25);
        plate.addFoodToPlate(addFoodAmount);
        System.out.printf("В миску добавлено %d корма. \n", addFoodAmount);

        Arrays.stream(cats).forEach(Homework7::eat);
        printFeedingInformation(cats, false);
    }

    private static void eat(Cat cat) {
        if (!cat.isHungry() || cat.getAppetite() > plate.getAmountOfFood()) {
            return;
        }

        cat.setHungry(!plate.decreaseFood(cat.getAppetite()));
    }

    private static int printFeedingInformation(Cat[] cats, boolean isFirstFeeding) {
        int hungryCatCount = (int) Arrays.stream(cats).filter(Cat::isHungry).count();

        StringBuilder sb = new StringBuilder()
                .append(String.format("Информация после %s кормления котов: \n", isFirstFeeding ? "первого" : "последующего"))
                .append(plate.amountInfo()).append("\n")
                .append(String.format("Накормленных котов %d шт. \n", cats.length - hungryCatCount))
                .append(String.format("Голодных котов %d шт. \n", hungryCatCount));

        System.out.println(sb);

        return hungryCatCount;
    }
}