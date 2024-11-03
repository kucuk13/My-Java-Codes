package deneme;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetCryptoPrices {

    private static final String API_KEY = "";
    private static final String URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?limit=500";

    public static void main(String[] args) {
        try {
            JSONArray cryptocurrencies = getPriceList();

            System.out.println("BTC: " + getPrice(cryptocurrencies, "BTC"));
            System.out.println("ETH: " + getPrice(cryptocurrencies, "ETH"));
            System.out.println("SOL: " + getPrice(cryptocurrencies, "SOL"));
            System.out.println("LINK: " + getPrice(cryptocurrencies, "LINK"));
            System.out.println("RENDER: " + getPrice(cryptocurrencies, "RENDER"));
            System.out.println("GRAPH: " + getPrice(cryptocurrencies, "GRT"));
            System.out.println("FET: " + getPrice(cryptocurrencies, "FET"));
            System.out.println("AKT: " + getPrice(cryptocurrencies, "AKT"));
            System.out.println("TAO: " + getPrice(cryptocurrencies, "TAO"));
            System.out.println("ONDO: " + getPrice(cryptocurrencies, "ONDO"));
            System.out.println("UNI: " + getPrice(cryptocurrencies, "UNI"));
            System.out.println("AVAX: " + getPrice(cryptocurrencies, "AVAX"));
            System.out.println("SNX: " + getPrice(cryptocurrencies, "SNX"));//
            System.out.println("INJ: " + getPrice(cryptocurrencies, "INJ"));
            System.out.println("ILV: " + getPrice(cryptocurrencies, "ILV"));//
            System.out.println("IMX: " + getPrice(cryptocurrencies, "IMX"));
            System.out.println("PORTAL: " + getPrice(cryptocurrencies, "PORTAL"));//
            System.out.println("GOAT: " + getPrice(cryptocurrencies, "GOAT"));//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static JSONArray getPriceList() throws Exception {
        HttpURLConnection connection = (HttpURLConnection) new URL(URL).openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Accepts", "application/json");
        connection.setRequestProperty("X-CMC_PRO_API_KEY", API_KEY);

        int responseCode = connection.getResponseCode();
        if(responseCode != 200) {
            throw new RuntimeException("HTTP GET Request Failed with Error code : " + responseCode);
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response = reader.readLine();
        reader.close();

        JSONObject jsonObject = new JSONObject(response);
        return jsonObject.getJSONArray("data");
    }

    public static double getPrice(JSONArray cryptocurrencies, String symbol){
        for (int i = 0; i < cryptocurrencies.length(); i++) {
            JSONObject cryptocurrency = cryptocurrencies.getJSONObject(i);
            if (cryptocurrency.getString("symbol").equalsIgnoreCase(symbol)) {
                return cryptocurrency.getJSONObject("quote").getJSONObject("USD").getDouble("price");
            }
        }
        throw new RuntimeException("Symbol not found: " + symbol);
    }
}
