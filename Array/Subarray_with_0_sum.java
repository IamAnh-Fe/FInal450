public class Subarray_with_0_sum {
  public static boolean solution1(int[] arr){
    for (int i = 0; i < arr.length; i++) {
      int sum = arr[i];
      if (sum == 0)
          return true;
      for (int j = i + 1; j < arr.length; j++) {
          sum += arr[j];
          if (sum == 0)
              return true;
      }
  }
  return false;
  }
  public static void main(String[] args) {
    int[] arr = {4, 2, -3, 1, 6};
    System.out.println(solution1(arr));
  }
}
// Input: {4, 2, -3, 1, 6}
// Output: true 
// Explanation:
// There is a subarray with zero sum from index 1 to 3.