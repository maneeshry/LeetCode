class Solution {
  public void reverseString(char[] s) {
      int y=0;
      char[] temp=new char[s.length];
      for(int x=s.length-1;x>=0;x--)
      {
          temp[y]=s[x];
          y++;
      }
      
      for(int i=0;i<s.length;i++)
      {
          s[i]=temp[i];
          
      }
      
  }
}