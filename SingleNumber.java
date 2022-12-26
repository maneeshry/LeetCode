class Solution {
  public int singleNumber(int[] nums) {
   Map<Integer,Integer> map = new HashMap<>();
   
  for (int i = 0; i < nums.length; i++) {
    if(map.containsKey(nums[i])) {
      map.remove(nums[i]);
    //  System.out.println(map.getKey());
    }
    else {
      map.put(nums[i], nums[i]);
      
    }
  }
  //int result=map.get(0);
 
  int result=map.get(map.keySet().toArray()[0]);
   return result;
  }
}
