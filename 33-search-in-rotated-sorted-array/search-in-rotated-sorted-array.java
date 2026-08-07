class Solution {
    //optimal solution with modified binary search using only one loop
    public int search(int[] nums, int target) {
        int l=0,u=nums.length-1,valley=0;
        while (l<=u) {
            int m=l+(u-l)/2;
            if(nums[m]==target) return m;
            else if (nums[m]<nums[u]) {  
                //right half is sorted, so check it
                if(nums[m]<target && target<=nums[u]) l=m+1;
                else u=m-1;

            }
            else {
                //left half is sorted, check
                if(nums[m]>target && target>=nums[l]) u=m-1;
                else l=m+1;
            }
        }
        return -1;
    }
}