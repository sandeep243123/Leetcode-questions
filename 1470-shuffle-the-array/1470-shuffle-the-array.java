class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int j=n,k=0;
        int f=1;
        for(int i=0;i<2*n;i++)
        {
            if(f==1)
            {
                arr[i]=nums[k];
                k++;
                f=0;
            }else{
                arr[i]=nums[j];
                f=1;
                j++;
            }
        }
        return arr;
    }
}