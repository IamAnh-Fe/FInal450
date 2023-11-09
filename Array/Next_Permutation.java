import java.util.Arrays;

public class Next_Permutation {
 public static int[] solution1(int[] nums){
  final int n = nums.length;

  // From back to front, find the first num < nums[i + 1]
  int i;
  for (i = n - 2; i >= 0; i--){
    if (nums[i] < nums[i + 1])
    break; 
  }
  System.out.println(i);
  // From back to front, find the first num > nums[i], swap it with nums[i]
  if (i >= 0)
    for (int j = n - 1; j > i; --j){
      if (nums[j] > nums[i]) {
        swap(nums, i, j);
        break;
      }
    }

  // Reverse nums[i + 1..n - 1]
  reverse(nums, i + 1, n - 1);
  return nums;
}

private static void reverse(int[] nums, int l, int r) {
  while (l < r)
    swap(nums, l++, r--);
}

private static void swap(int[] nums, int i, int j) {
  final int temp = nums[i];
  nums[i] = nums[j];
  nums[j] = temp;
}
  public static void main(String[] args) {
  int[] nums = {3,2,1};
  System.out.println(Arrays.toString(solution1(nums)));
 } 
}
// Input: nums = [3,2,1]
// Output: [1,2,3]