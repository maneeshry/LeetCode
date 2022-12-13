/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
      long first=0,last=n;
      long mid=(first+last)/2;
      while(mid!=first)
      {
          if(isBadVersion((int)mid))
          {
              last=mid;
          }
          else
          {
              first=mid;
             
          }
          mid=(first+last)/2;
      }
      return (int)mid+1;
  }
}