
class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int j=0,i=0;
        int arr[]=new int[nums.length];
        while(k!=0){
            arr[j++]=nums[nums.length-k];
            k--;
        }
        while(j<nums.length){
            arr[j++]=nums[i++];
        }
        j=0;
        while(j<nums.length){
            nums[j]=arr[j];
            j++;
        }
    }
}