public class Minimize_the_maximum_difference_between_the_heights {
  public static int solution1(int[] arr, int k){
    int n = arr.length;
    Arrrays.sort(arr);
        // Maximum possible height difference
        int ans = arr[n - 1] - arr[0];
        int tempmin, tempmax;
        tempmin = arr[0];
        tempmax = arr[n - 1];
 
        for (int i = 1; i < n; i++) {
 
            // if on subtracting k we got negative then
            // continue
            if (arr[i] - k < 0)
                continue;
 
            // Minimum element when we add k to whole array
            tempmin = Math.min(arr[0] + k, arr[i] - k);
 
            // Maximum element when we subtract k from whole
            // array
            tempmax
                = Math.max(arr[i - 1] + k, arr[n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
  }
  
  public static void main(String[] args) {
    int[] arr = {1, 15, 10};
    int k = 6;
    System.out.println(solution1(arr, k));
  }
}
// Input: arr[] = {1, 15, 10}, k = 6
// Output:  Maximum difference is 5.
// Explanation: Change 1 to 7, 15 to 9 and 10 to 4. Maximum difference is 5