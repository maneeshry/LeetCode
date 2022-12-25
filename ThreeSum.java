public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++)
    {
        for(int j=i+1;j<nums.length-1;j++)
        {
            
            for(int k=j+1;k<nums.length;k++)
            {
                int temp=nums[i] + nums[j] + nums[k];
                if(i!=j && j!=k && i!=k && temp==0)
                {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    break;
                }
            }
        }
    }
    List<List<Integer>> newList = list.stream()
                                  .distinct()
                                  .collect(Collectors.toList());

    for(int i=0;i<list.size()-1;i++)
    {
        if(list.get(i).equals(list.get(i+1)))
        {
            list.remove(i+1);
        }
    }
    System.out.println(list);
    return newList;
  }
}