class Solution {
    public int findMin(int[] nums) {
        int l=0, u=nums.length-1;
        // if(nums[l]<nums[u]) return nums[l];
        while(l<u) {
            int m=l+(u-l)/2;
            if(nums[u]<nums[m]) l=m+1;
            else if(nums[m]<nums[u]) u=m;
        }
        return nums[l];
    }
}