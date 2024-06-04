import cost.Cost;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static ArrayList<Cost> costs;
    public static void main(String[] args) {
        createList(10);
        updateCost(8, 35);
        System.out.println(costs);
    }

    private static void createList(int range) {
        costs = IntStream.range(0, range)
                .mapToObj(i -> new Cost())
                .collect(Collectors.toCollection(ArrayList::new));
    }

    private static void updateCost(int minCost, int maxCost) {
        Random random = new Random();

        int maxFromZero = maxCost - minCost;
        Consumer<Cost> updateCostConsumer = cost -> cost.setCost(minCost + random.nextInt(maxFromZero));

        costs.stream().forEach(updateCostConsumer);
    }
}