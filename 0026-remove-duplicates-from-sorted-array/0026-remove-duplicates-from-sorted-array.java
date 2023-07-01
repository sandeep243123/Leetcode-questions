class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int k=0;

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsValue(nums[i])){
                map.put(k,nums[i]);
                k++;
            }
        }
        for(int i=0;i<k;i++)
        {
            nums[i]=map.get(i);
        }
        return k;
    }
}