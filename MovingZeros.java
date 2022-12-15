class Solution {
  public void moveZeroes(int[] nums) {
    List<Integer> temp = new ArrayList();
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      temp.add(nums[i]);
      
    }
    for (int i = 0; i < temp.size(); i++) {

      if (temp.get(i) == 0) {
        count++;
        temp.remove(i);
        i--;
      }

    }
    for (int i = 0; i < count; i++) {
      temp.add(0);
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = temp.get(i);
    }
    
  }
}