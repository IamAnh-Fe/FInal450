import java.util.Arrays;

public class Reverse_an_array {
  public static int[] reverse(int[] arr){
    int temp = 0; 
    int start = 0; 
    int end = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      if(start < end){
        temp = arr[start]  ;
        arr[start] = arr[end];
        arr[end] = temp;

      }
      start++;
      end--;
        }
    return arr;
  }

  public static void main(String[] args) {
  int[] arr = {1,2,3};
  System.out.println(Arrays.toString(reverse(arr)));
  }
}
// Input  : arr[] = {1, 2, 3}
// Output : arr[] = {3, 2, 1}