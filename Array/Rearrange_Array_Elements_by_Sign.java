import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rearrange_Array_Elements_by_Sign {
public static int[] solution1(int[] nums){
  int[] ans = new int[nums.length];
    List<Integer> pos = new ArrayList<>();
    List<Integer> neg = new ArrayList<>();

    for (final int num : nums)
      (num > 0 ? pos : neg).add(num);

    for (int i = 0; i < pos.size(); ++i) {
      ans[i * 2] = pos.get(i);
      ans[i * 2 + 1] = neg.get(i);
    }

    return ans;

}
  public static void main(String[] args) {
  int[] arr = {3,1,-2,-5,2,-4};
  System.out.println(Arrays.toString(solution1(arr)));

}
}
// Input: nums = [3,1,-2,-5,2,-4]
// Output: [3,-2,1,-5,2,-4]