class Solution {
    public int findMin(int[] nums) {
        int u=nums.length-1,l=0;
        int m=0;
        while(l<u) {
            m=l+(u-l)/2;
            if(nums[m]>nums[u]) l=m+1;
            else if(nums[m]<nums[u]) u=m;
            else    u--;
        }
        return nums[u];
    }
}