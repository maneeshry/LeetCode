class Solution {
  public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<>();
      List<Integer> list = new ArrayList<>();

      for(int i=0;i<numRows;i++)
      {
          list.add(0,1);
          for(int j=1;j<list.size()-1;j++)
          {
              list.set(j,list.get(j)+list.get(j+1));
              
          }

          result.add(new ArrayList<Integer> (list)); /* If you will add result.add(list) it will add reference to the list "list" inside all elements of list ""result"", and since you are constantly changing the list "list", by adding more numbers, all elements in a list will point to same list, hence will contain like this [[1,2,3,4,5,6,7,8,.9], [1,2,3,4,5,6,7,8,9] .....] instead of [[1], [1,2], [1,2,3], ....[1,2,3,4,5,6,7,8,9]]*/
      } 
      return result;
  }
}