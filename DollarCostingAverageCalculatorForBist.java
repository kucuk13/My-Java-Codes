package deneme;

import java.util.ArrayList;
import java.util.List;

public class DollarCostingAverageCalculatorForBist {

    public static Double TotalInvest = 0d;
    public static Double TotalAmount = 0d;

    public static void main(String[] args) throws Exception {
        List<Double> priceList = parsePrices(DollarCostingAverageCalculatorInputForBist.prices);
        List<Double> trUsdPriceList = parsePrices(DollarCostingAverageCalculatorInputForDollar.prices);
        int i = 0;
        for (Double price : priceList){
            TotalInvest += DollarCostingAverageCalculatorInputForBist.monthlyAmount;
            TotalAmount += DollarCostingAverageCalculatorInputForBist.monthlyAmount * trUsdPriceList.get(i) / price;
            i++;
        }
        System.out.println("You had invested " + TotalInvest);
        System.out.println("You have " + TotalAmount + " stock.");
        System.out.println("You have " + ((TotalAmount * DollarCostingAverageCalculatorInputForBist.todayPrice) / DollarCostingAverageCalculatorInputForDollar.todayPrice) + " $");
    }

    public static List<Double> parsePrices(String data) {
        String[] lines = data.split("\n");
        List<Double> prices = new ArrayList<>();

        for (String line : lines) {
            String[] columns = line.split("\t");
            if (columns.length > DollarCostingAverageCalculatorInputForBist.columnNo) {
                String priceString = convertPunctuation(columns[DollarCostingAverageCalculatorInputForBist.columnNo]);
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
