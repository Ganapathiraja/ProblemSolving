public class BuyandSellStock_I {

    public static void main(String[] args) {

        /*
        * Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/

        int[] prices = {7,1,5,3,6,4};
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice){
                minprice = prices[i];
            System.out.println(minprice);}
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }

        System.out.println(maxprofit);


    }
}
