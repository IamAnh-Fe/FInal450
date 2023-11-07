import java.util.Arrays;

public class Move_all_negative_numbers_to_beginning_and_positive_to_end_with_constant_extra_space {
  public static int[] solution1 (int[] arr){
    int low = 0; 
    int high = arr.length - 1; 
    while (low <= high) { 
        if (arr[low] <= 0) 
            low++; 
        else
            swap(arr, low, high--); 
    } 
    
    return arr;
  }
  private static void swap(int[] arr,int i , int j) {
    final int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  public static void main(String[] args) {
   int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
     System.out.println(Arrays.toString(solution1(arr)));

  }
}
// Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
// Output: -12 -13 -5 -7 -3 -6 11 6 5