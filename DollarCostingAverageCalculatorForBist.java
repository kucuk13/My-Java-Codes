package deneme;

import java.util.ArrayList;
import java.util.List;

public class DollarCostingAverageCalculatorForBist {

    public static void main(String[] args) throws Exception {
        double totalInvest = 0d;
        double totalAmount = 0d;

        List<Double> priceList = parsePrices(DollarCostingAverageCalculatorInput.prices);
        List<Double> trUsdPriceList = parsePrices(DollarCostingAverageCalculatorInputForTrUsdPrices.prices);
        int i = 0;
        for (Double price : priceList){
            totalInvest += DollarCostingAverageCalculatorInput.monthlyAmount;
            totalAmount += DollarCostingAverageCalculatorInput.monthlyAmount * trUsdPriceList.get(i) / price;
            i++;
        }
        System.out.println("You had invested " + totalInvest);
        System.out.println("You have " + totalAmount + " stock.");
        System.out.println("You have " + ((totalAmount * DollarCostingAverageCalculatorInput.todayPrice) / DollarCostingAverageCalculatorInputForTrUsdPrices.todayPrice) + " $");
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
