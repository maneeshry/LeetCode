class Solution {
  public int findGCD(int[] nums) {
      Arrays.sort(nums);
      int a=nums[0],b=nums[nums.length-1];
      int result=gcd(a,b);
      return result;
  }

  public int gcd(int a,int b)
  {
      if(b==0)
      {
          return a;
      }
      else
      { 
          return gcd(b,a%b);
      }
  }
}