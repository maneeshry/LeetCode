class Solution {
  public int maxSubArray(int[] nums) {
      if(nums.length==1)
      {
          return nums[0];
      }
      
      int temp=0,max=-50000;
      for(int i=0;i<nums.length;i++)
      {
          temp=0;
          for(int j=i;j<nums.length;j++)
          {
              temp=temp+nums[j];
              System.out.println(temp);
              if(temp>max)
              {
                  max=temp;
              }
              if(temp<0)
              {
                  temp=nums[i];
              }
          }
      }
      
      return max;
  }
}