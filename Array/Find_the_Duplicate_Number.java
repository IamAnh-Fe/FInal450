public class Find_the_Duplicate_Number {
  //Brute Force
  public static int solution1(int[] nums) { 
    for (int i = 0; i < nums.length ; i++) {
  for (int j = i + 1; j < nums.length ; j++) {
    if(nums[i] == nums[j]){
    return nums[i];
    }
  }
  
 }  
 return -1;
  
  }
  // 2 Pointer
  public static int solution2(int[] nums){
    int slow = nums[nums[0]];
    int fast = nums[nums[nums[0]]]; 
    
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[nums[fast]];
    }    
    
    slow = nums[0];
    
    while (slow != fast) {
      slow = nums[slow];
      fast = nums[fast];
    }
   
    return slow;
  }
  public static void main(String[] args) {
   int[] nums = {1,3,4,2,2}; 
//  System.out.println(solution1(nums));
   System.out.println(solution2(nums));
  }
}
// Input: nums = [1,3,4,2,2]
// Output: 2

