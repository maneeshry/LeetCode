class Solution {
  public int climbStairs(int n) {
      int a=0,b=1,result=0;
      for(int i=2;i<=n+1;i++)
      {
          result=a+b;
          a=b;
          b=result;
      }
      return result;
  }
}