package Day7;

public class BuyandSell {
    public static int buyAndSellStock(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit =0;

        for(int i=0; i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                    maxProfit = Math.max(maxProfit, profit);
                }else{
                    buyPrice = prices[i];
                }
            }
            return maxProfit;
        }
    public static void main(String[] args){
        int prices[] = {2,4,5,7,9,3};
        System.out.println(buyAndSellStock(prices));
    }
}
