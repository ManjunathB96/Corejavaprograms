package Objectorintedprogramstock;

import java.io.IOException;

    public class StockManagement {
        public static void main(String[] args) throws IOException {
            Stocks stocks = readStockJsonFile();
            calculateStockTotalValue(stocks);
        }

        private static Stocks readStockJsonFile() throws IOException {
            ObjectMapper objectMapper = new ObjectMapper();

            Stocks stocks;
            stocks = objectMapper.readValue();
            stocks.getStockList().forEach(System.out::println);
            return stocks;
        }

        private static void calculateStockTotalValue(Stocks stocks) {
            for (int i = 0; i < stocks.getStockList().size(); i++) {
                int totalValueOfStock =
                        stocks.getStockList().get(i).getNumberOfShare()
                                * stocks.getStockList().get(i).getSharePrice();
                System.out.println("Stock name is: " + stocks.getStockList().get(i).getNameOfStock());
                System.out.println("Stock total value is: " + totalValueOfStock);
            }
        }
    }

