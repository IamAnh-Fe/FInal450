public class Best_Time_to_Buy_and_Sell_Stock {
  //Brute Force
  public static int solution1(int[] prices){
    int maxprofit = 0;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
          int diff = prices[j] - prices[i];
          if(diff > maxprofit){
            maxprofit = diff;
          }
        
      }
    }
    return maxprofit;
  }
  //Greedy
  public static int solution2(int[] prices){
    int buy = prices[0]; int maxprofit = 0;
    for (int i = 0; i < prices.length; i++) {
      if(buy > prices[i]){
        buy = prices[i];
      } else if(prices[i] - buy > maxprofit){
        maxprofit = prices[i] - buy;
      }
    }
    return maxprofit;
  }
  
  public static void main(String[] args) {
    int[] prices = {7,1,5,3,6,4};
    System.out.println(solution1(prices));
  }
}
// Input: prices = [7,1,5,3,6,4]
// Output: 5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
// Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.