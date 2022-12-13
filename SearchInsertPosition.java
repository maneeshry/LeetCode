class Solution {
  public int searchInsert(int[] nums, int target) {
      int flag=0,i=0;
      while(i<nums.length)
      {
          if(nums[i]==target)
          {
              
              break;
          }
          else
          {
              if(target<nums[i])
              {
                  
                  break;
              }
              else
              {
                  i++;
              }
          }
          flag=i;
      }
      return flag;
  }
}