class Solution {
    public boolean validMountainArray(int[] arr) {
        int flag=0;
        if(arr.length<3 || arr[0]>=arr[1]) return false;
        for(int i=0;i<arr.length-1;i++) {
            if(arr[i+1]<arr[i]) {
                flag=1;continue;
            } 
            else if(flag==0) {
                if(arr[i+1]<=arr[i]) return false;
            }
            else if(flag==1) {
                if(arr[i+1]>=arr[i]) return false;
            }
        }

        // if) return false;
        return flag==1 ;
    }
}