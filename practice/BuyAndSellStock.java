public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        // int profit = 0;
        // int pist = Integer.MIN_VALUE;
        // int overallProfit = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     for (int j = i + 1; j < prices.length; j++) {
        //         profit = prices[j] - prices[i];
        //         if (profit > pist) {
        //             pist = profit;
        //         }
        //     }
        //     if (pist > overallProfit) {
        //         overallProfit = pist;
        //     }
        // }
        // return overallProfit;

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices ){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;

            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
