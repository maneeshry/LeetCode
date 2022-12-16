class Solution {
  public String reverseWords(String s) {
      String temp="";
      String[] string=s.split(" ");
      System.out.println(string[0]);
      for(int i=0;i<string.length;i++)
      {
          StringBuilder str=new StringBuilder();
          str.append(string[i]);
          temp=temp+str.reverse().toString()+" ";
      }
      return temp.trim();
  }
}