class Solution {
    public boolean search(int[] nums, int target) {
        int u=nums.length-1,l=0, m=0;
        while(l<u) {
            m=l+(u-l)/2;
            if(nums[m]>nums[u]) l=m+1;
            else if(nums[m]<nums[u]) u=m;
            else {
                if(nums[u-1]>nums[u]) {
                    l=u;break;
                }
                u--;
            }
        }

        int pivot=u; 
        l=0; u=pivot-1;
        System.out.println(l+" "+u);

        while(l<=u) {
            m=l+(u-l)/2;
            if(target>nums[m]) l=m+1;
            else if(target<nums[m]) u=m-1;
            else return true;
        }

        l=pivot; u=nums.length-1;
        System.out.println(l+" "+u);

        while(l<=u) {
             m=l+(u-l)/2;
            if(target>nums[m]) l=m+1;
            else if(target<nums[m]) u=m-1;
            else return true;
        }

        return false;
    }
}