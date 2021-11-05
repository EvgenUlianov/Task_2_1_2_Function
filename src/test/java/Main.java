import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 2. Кадастровый помощник");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость квадратного метра");

        final int price = scanner.nextInt();


        List<Deal> deals = getRandomDeals();

        deals.stream()
                .map(deal -> {
                    int fairCost =  deal.getLength() * deal.getWidth() * price;
                    boolean isFair = deal.getCost() >= fairCost;
                    return String.format("%s - %s", deal.toString(), isFair ? "честная" : "фиктивная");
                })
                .forEach(System.out::println);

    }

    private static List<Deal> getRandomDeals() {
        final int minLength = 10;
        final int maxLength = 20;
        final int minWidth = 10;
        final int maxWidth = 20;
        final int minCost = 1000;
        final int maxCost = 4000;
        final int numberOfDeals = 30;

        Random random = new Random();

        List<Deal> deals = new ArrayList<>();
        for (int i = 0; i < numberOfDeals; i++) {
            final int length = minLength + random.nextInt(maxLength - minLength);
            final int width = minWidth + random.nextInt(maxWidth - minWidth);
            final int cost = minCost + random.nextInt(maxCost - minCost);
            deals.add(new Deal(length, width, cost));
        }
        return deals;
    }
}
