import java.util.Arrays;

public class Sort_an_array_of_0_1_and_2 {
  // 3 pointers
  public static int[] solution1(int[] arr){
    int zero = -1;
    int one = -1;
    int two = -1;
    for (int i : arr) {
      if(i == 0){
        System.out.println(zero);
        arr[++two] = 2;
        arr[++one] = 1;
        arr[++zero] = 0;
      } else if(i == 1){
        arr[++two] = 2;
        arr[++one] = 1;
      } else {
        arr[++two] = 2;
      }
    //     System.out.println(one);
    // System.out.println(two);


    }
    return arr;
  }

  // 2 poiter
  public static int[] solution2(int[] arr){
  int l = 0;
  int r = arr.length - 1;
  for (int i = 0; i <= r;) {
    if(arr[i] == 0){
      swap(arr, i++, l++);
    } else if(arr[i] == 1){
      ++i;
    } else {
      swap(arr, i, r--);
    }
  } 

    return arr;
  }
 
  private static void swap(int[] arr, int i, int j) {
    final int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    int[] arr = {0, 2, 1, 2, 0};
    System.out.println(Arrays.toString(solution1(arr)));
    System.out.println(Arrays.toString(solution2(arr)));

  }
}
// Input: 
// arr[]= {0 2 1 2 0}
// Output:
// 0 0 1 2 