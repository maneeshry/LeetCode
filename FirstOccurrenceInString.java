class Solution {
  public int strStr(String haystack, String needle) {
      if(haystack.equals(needle))
      {
          return 0;
      }
      for(int i=0;i<=haystack.length()-needle.length();i++)
      {
          //System.out.println(haystack.substring(i,i+needle.length()));
          if(haystack.substring(i,i+needle.length()).equals(needle))
          {
              
              return i;
          }
      }
      return -1;
  }
}