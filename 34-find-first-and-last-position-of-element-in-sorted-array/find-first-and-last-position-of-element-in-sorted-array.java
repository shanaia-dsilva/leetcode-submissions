class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0, u=nums.length-1;
        int res[]={-1,-1};
        while(l<=u) {
            int m=l+(u-l)/2;
            if(nums[m]>target) u=m-1;
            else if(nums[m]<target) l=m+1;
            else {
                res[0]=m;
                u=m-1;
            }
        }
        l=0; u=nums.length-1;
        while(l<=u) {
            int m=l+(u-l)/2;
            if(nums[m]>target) u=m-1;
            else if(nums[m]<target) l=m+1;
            else {
                res[1]=m;
                l=m+1;
            }
        }
        return res;
    }
}