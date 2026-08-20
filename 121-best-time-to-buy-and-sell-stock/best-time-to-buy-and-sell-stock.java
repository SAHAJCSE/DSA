class Solution {
    public int maxProfit(int[] prices) {
        int minbuy = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>minbuy){
                maxprofit=Math.max(maxprofit,prices[i]-minbuy);
            }else{
                minbuy=prices[i];
            }
        }
        return maxprofit;
    }
}