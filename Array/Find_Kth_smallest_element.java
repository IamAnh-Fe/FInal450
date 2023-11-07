import java.util.PriorityQueue;

public class Find_Kth_smallest_element {
  //Binary Search
  static int count(int[] arr, int mid){
    int cnt = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] <= mid){
        cnt++;
      }
    }
    return cnt;
  }  
  public static int binarySearch(int[] arr, int k){
    int low = Integer.MAX_VALUE;
    int high = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      low = Math.min(low, arr[i]);
      high = Math.max(high, arr[i]);
    }
    while (low < high) {
      int mid = low + (high - low) / 2;
      if(count(arr, mid) < k){
        low = mid + 1;
      } else {
        high = mid;
      }
    }
    return low;
  }
  // Heap(Priority Queue)
  public static int Heap(int[] arr, int k){
    PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
    for (int i = 0; i < arr.length; i++) {
      pq.offer(arr[i]);
      if(pq.size() > k){
        pq.poll();
      }
    }
    return pq.peek();
  }

  // QuickSelect
  // Counting Sort

  public static void main(String[] args) {
    int[] arr = {7, 10, 4, 3, 20, 15};
    int k = 3;
    System.out.println(binarySearch(arr, k));
    System.out.println(Heap(arr, k));
  }
}
// Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
// Output: 7

