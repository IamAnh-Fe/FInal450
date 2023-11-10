public class Maximum_Product_Subarray {
  public static int solution1(int[] arr){
    int sum1 = Integer.MIN_VALUE;
    int sum2 = 0;
    for (int i = 0; i < arr.length; i++) {
      sum1 *=  arr[i];
      if(sum1 > sum2){
        return sum2;
      }
    }
    return sum2;
    
  }

  public static void main(String[] args) {
    int[] arr = {6, -3, -10, 0, 2};
    System.out.println(solution1(arr));
  }
}
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is [6, -3, -10] which gives product as 180.