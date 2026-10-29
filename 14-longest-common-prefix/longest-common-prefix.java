class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min=strs[0].length(); int index=0;
        for(int i=0;i<strs.length;i++){
            if(min>strs[i].length()) {
                index=i; min=strs[i].length();
            }
        }
        if(min==0) return "";
        String shortest=strs[index];
        // System.out.println(min);
        // return strs[index];
        for(int i=0;i<strs.length;i++ ) {
            for(int j=shortest.length()-1;j>=0;j-- ) {
                String s=strs[i];
                if(shortest.charAt(j)!=s.charAt(j)) 
                shortest=shortest.substring(0,j);
                System.out.println(shortest);
            }
        }
        return shortest;
    }
}