class Solution {
  public String longestPalindrome(String s) {
      String flag="";
      StringBuilder sb = new StringBuilder(s);
      List<String> stringList = new ArrayList<>();
      if(sb.reverse().toString().equals(s) || s==null)
      {
          return s;
      }

      for(int i=0;i<s.length();i++)
      {
          for(int j=i+1;j<=s.length();j++)
          {
              StringBuilder substrings=new StringBuilder(s.substring(i,j));
              //String substrings=(s.substring(i,j));
              StringBuilder sub=new StringBuilder(substrings);
              sub=sub.reverse();
              //System.out.println(substrings+" : "+sub);
              
              if(substrings.toString().equalsIgnoreCase(sub.toString()))
              {
                  flag=substrings.toString();
                  stringList.add(flag);
                  //System.out.println(stringList);
              }
          }
          
      }
     int max=0,index=0;
     for(int i=0;i<stringList.size();i++)
     {
         if(stringList.get(i).length()>max)
         {
             max=stringList.get(i).length();
              index=i;
         }
     }
      return (stringList.get(index));
  }
}