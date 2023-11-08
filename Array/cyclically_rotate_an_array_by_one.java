import java.util.Arrays;

public class cyclically_rotate_an_array_by_one {
  public static int[] rotate1(int[] arr){
    int last = arr[arr.length - 1];
    for (int i = arr.length  - 1; i > 0 ; i--) {
       arr[i] = arr[i - 1];
    }
    arr[0] = last;
    return arr;
  }
  //Two Pointer
  public static int[] rotate2(int[] arr){
    int i = 0; int j = arr.length - 1;
    while (i != j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
    }
    return arr;
  }
  // Reversal Algorithm
  public static int[] rotate3(int[] arr){
    int k = 1;
    int i,j;
    int n = arr.length ;
    // Reverse the first n-1 terms
    for (i = 0, j = n - k - 1; i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }

  // Reverse the entire array
  for (i = 0, j = n - 1; i < j; i++, j--) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }
  return arr;
  }
  public static void main(String[] args) {
  int[] arr =  {1, 2, 3, 4, 5 };
  // System.out.println(Arrays.toString(rotate1(arr)));
  // System.out.println(Arrays.toString(rotate2(arr)));
    System.out.println(Arrays.toString(rotate3(arr)));


  }
}
// Input: arr[] = {1, 2, 3, 4, 5}
// Output: arr[] = {5, 1, 2, 3, 4}