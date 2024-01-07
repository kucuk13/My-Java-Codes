package deneme;

import java.util.ArrayList;
import java.util.List;

public class DollarCostingAverageCalculatorForBist {

    public static Double TotalInvest = 0d;
    public static Double TotalAmount = 0d;

    public static void main(String[] args) throws Exception {
        List<Double> priceList = parsePrices(DollarCostingAverageCalculatorInput.prices);
        List<Double> trUsdPriceList = parsePrices(DollarCostingAverageCalculatorInputForTrUsdPrices.prices);
        int i = 0;
        for (Double price : priceList){
            TotalInvest += DollarCostingAverageCalculatorInput.monthlyAmount;
            TotalAmount += DollarCostingAverageCalculatorInput.monthlyAmount * trUsdPriceList.get(i) / price;
            i++;
        }
        System.out.println("You had invested " + TotalInvest);
        System.out.println("You have " + TotalAmount + " stock.");
        System.out.println("You have " + ((TotalAmount * DollarCostingAverageCalculatorInput.todayPrice) / DollarCostingAverageCalculatorInputForTrUsdPrices.todayPrice) + " $");
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
