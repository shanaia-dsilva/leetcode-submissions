class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
        int freq_len=0, l=0,max=0;

        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            freq_len=Math.max(freq_len,map.get(c));
            while (r-l+1-freq_len>k){
                char sb=s.charAt(l);
                map.put(sb,map.get(sb)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }

        // char most_freq=' ';
        // String substr=""+s.charAt(0);
        // while(r<s.length()) {
        //     char c=s.charAt(r);
        //     char sb=s.charAt(l);
        //     int len=substr.length();
        //     map.put(c,map.getOrDefault(c,0)+1);
        //     max=Math.max(max,map.get(c));
        //     if(len-map.get(c)>max) {
        //         most_freq=c;
        //         max=len-map.get(c);
        //     }
        //     if(c!=sb) t--;
        //     while(t==0) {
        //         if(sb!=most_freq) t++;
        //         l++;
        //         substr=substr.substring(l,len);
        //     }
        //     r++;
        //     substr+=c;
        //     System.out.println(map.get(c));
        // }

        return max;
        
    }
}