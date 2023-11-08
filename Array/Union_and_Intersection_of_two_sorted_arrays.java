
public class Union_and_Intersection_of_two_sorted_arrays {
 //Two Pointer
  public static int Union(int[] arr1, int[] arr2, int n, int m){
   int i = 0;
   int j = 0;
   while (i < n && j < m) {
    if(arr1[i] < arr2[j]){
      System.out.print(arr1[i++] + " ");
    }else if(arr1[i] > arr2[j]){
      System.out.print(arr2[j++] + " ");
    } else {
      System.out.print(arr2[j++] + " ");
      i++;
    }
   }
   while (i < n)
   System.out.print(arr1[i++] + " ");
   while (j < m)
   System.out.print(arr2[j++] + " ");

   return 0;
  }
  public static void Intersection(int[] arr1, int[] arr2, int n, int m){
    int i = 0; int j = 0;
    while (i < n && i < m) {
      if(arr1[i] < arr2[j]){
        i++;
      } else if(arr1[i] > arr2[j]){
        j++;
      } else {
        System.out.print(arr2[j++] + " ");
        i++;
      }
    } 
    
  }
   public static void main(String[] args) {
    int[] arr1 = {1, 3, 4, 5, 7};
    int[] arr2 = {2, 3, 5, 6};
    int n = arr1.length;
    int m = arr2.length;
    // System.out.println(Arrays.toString(Union(arr1, arr2,n,m)));
    // Intersection(arr1, arr2, n, m);
    Union(arr1, arr2, n, m);
  }
}
// Input: arr1[] = {1, 3, 4, 5, 7}
//         arr2[] = {2, 3, 5, 6} 
// Output: Union : {1, 2, 3, 4, 5, 6, 7} 
//          Intersection : {3, 5}