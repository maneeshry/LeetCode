import java.io.*;
import java.util.*;
import java.lang.*;

class Solution {
  public int search(int[] nums, int target) {
      int flag=-1;

      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]==target)
          {
              flag=i;
              break;
          }
      }
      return flag;
      
  }
}

public class BinarySearch {
    public static void main(String[] args) {
      Solution solution= new Solution();
      int[] nums={4,5,6,7,0,1,2};
      int target=0;
      int result=solution.search(nums,target);
      System.out.println(result);
    }
}

