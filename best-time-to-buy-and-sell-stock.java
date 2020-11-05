// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
   // tc -> n^2, sc-> 1
   public int maxProfit(int[] prices) {
       int maxProfit = 0;
       for(int i=0; i<prices.length; i++){
           for(int j=i+1; j<prices.length; j++){
               if(prices[j]>prices[i])
               maxProfit = Math.max(maxProfit, prices[j]-prices[i]);
           }
       }
       return maxProfit;
   }
}

class Solution {
   // tc -> n, sc-> 1
   public int maxProfit(int[] prices) {
       int minPrice = Integer.MAX_VALUE, maxProfit = 0;
       for(int i=0; i<prices.length; i++){
           if(prices[i]<minPrice) minPrice = prices[i];
           else
           maxProfit = Math.max(maxProfit, prices[i]-minPrice);
       }
       return maxProfit;
   }
}
