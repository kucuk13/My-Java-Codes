package deneme;

import java.util.ArrayList;
import java.util.List;

public class DollarCostingAverageCalculator {

    public static void main(String[] args) throws Exception {
        List<Double> priceList = parsePrices(DollarCostingAverageCalculatorInput.prices);
        Double avgPrice = priceList.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);

        Double totalInvest = DollarCostingAverageCalculatorInput.monthlyAmount * priceList.size();
        Double totalAmount = totalInvest / avgPrice;
        System.out.println("You had invested " + avgPrice);
        System.out.println("You had invested " + totalInvest);
        System.out.println("You have " + totalAmount + " stock.");
        System.out.println("You have " + totalAmount * DollarCostingAverageCalculatorInput.todayPrice + " $");
    }

    public static List<Double> parsePrices(String data) {
        String[] lines = data.split("\n");
        List<Double> prices = new ArrayList<>();

        for (String line : lines) {
            String[] columns = line.split("\t");
            if (columns.length > DollarCostingAverageCalculatorInput.columnNo) {
                String priceString = convertPunctuation(columns[DollarCostingAverageCalculatorInput.columnNo]);
                try {
                    Double price = Double.parseDouble(priceString);
                    prices.add(price);
                } catch (NumberFormatException e) {
                    System.out.println("Hatalı sayı formatı: " + priceString);
                }
            }
        }

        return prices;
    }

    public static String convertPunctuation(String input) {
        return input.replace(".", "").replace(",", ".");
    }
}
