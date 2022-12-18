class Solution {
  public int[] searchRange(int[] nums, int target) {
      int[] temp={-1,-1};
      
      int x=0;
      for(int i=0;i<nums.length;i++)
      {
          if(target==nums[i])
          {
              temp[0]=i;
              x=i;
              break;
          }
      }
      for(int i=nums.length-1;i>=x;i--)
      {
          if(target==nums[i])
          {
              temp[1]=i;
              break;
          }
      }
      return temp;
  }
}