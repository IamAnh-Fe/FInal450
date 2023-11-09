public class Count_pairs_with_given_sum {
  //Brute Force
 public static int solution1(int[] arr, int K){
  int cnt = 0;
  for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
      if(arr[i] + arr[j] == K ){
        cnt++;
      }
    }
    
  }
  return cnt;
 }
  public static void main(String[] args) {
    int[] arr = {1, 5, 7, -1};
    int K = 6;
    System.out.println(solution1(arr, K));
  }
}
// Input: arr[] = {1, 5, 7, -1}, K = 6
// Output:  2
// Explanation: Pairs with sum 6 are (1, 5) and (7, -1).