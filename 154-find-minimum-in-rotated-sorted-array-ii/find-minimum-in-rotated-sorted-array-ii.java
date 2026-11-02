class Solution {
    public int findMin(int[] nums) {
        int u=nums.length-1,l=0;
        int m=0;
        while(l<u) {
            m=l+(u-l)/2;
            if(nums[m]>nums[u]) l=m+1;
            else if(nums[m]<=nums[u] && nums[m]!=nums[l]) u=m;
            else {
                l+=1; u-=1;
            }
        }
        System.out.println(u+" "+l+" "+m);
        return nums[u];
    }
}