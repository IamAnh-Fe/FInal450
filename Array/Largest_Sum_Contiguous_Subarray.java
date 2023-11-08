public class Largest_Sum_Contiguous_Subarray {
  //Brute Force
  public static int solution1(int[] arr){
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
       if (arr[i] + arr[j] > cnt){
        cnt = arr[i] + arr[j];
       }
      }
    }
    return cnt;

  }

  //Kadane Algotithm
  public static int solution2(int[] arr){
    int sum1 = Integer.MIN_VALUE;
    int sum2 = 0;
    for (int i = 0; i < arr.length; i++) {
      sum1 += arr[i];
      if(sum1 > sum2){
        sum2 = sum1;
      }
      if(sum1 < 0){
        sum1 = 0;
      }
    }
    return sum2;
  }
  public static void main(String[] args) {
    int[] arr = {1,2,-9,3,5};
    // System.err.println(solution1(arr));
    System.err.println(solution2(arr));

  }
}
