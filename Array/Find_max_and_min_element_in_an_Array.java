public class Find_max_and_min_element_in_an_Array {
  public static void getMinMax(int[] arr){
    int max = arr[0];
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] > max){
        max = arr[i];
      }
      if(arr[i] < min){
        min = arr[i];
      }
      
    }
    System.out.println("Maximum element is " + max);
    System.out.println("Minimum element is " + min);
  }
  public static void main(String[] args) {
  int[] arr = {3, 5, 4, 1 ,9};
  getMinMax(arr);

}
}
// Input: arr[] = {3, 5, 4, 1, 9}
// Output: Minimum element is: 1
//         Maximum element is: 9