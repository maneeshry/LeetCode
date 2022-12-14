class Solution {
    public void rotate(int[] nums, int k) {
        int x=0;
        Queue<Integer> temp = new LinkedList<Integer>();
        for(int i=nums.length-1;i>=0;i--)
        {
            temp.add(nums[i]);
        }
        while(k>0)
        {
            x=temp.peek();
            temp.remove();
            temp.add(x);
            k--;
        }

        for(int i=nums.length-1;i>=0;i--)
        {
            nums[i]=temp.poll();
        }
        System.out.println(nums);
    }
}