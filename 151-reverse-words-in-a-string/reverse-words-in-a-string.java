class Solution {
    public String reverseWords(String s) {
        String rev[]=s.trim().split(" "), result="";
        for(int i=rev.length-1;i>=0; i--) {
            result=result.trim()+" "+rev[i].trim();
        }

        // String result="",word="";
        // s=s.trim()+" ";
        // for(int i=0;i<s.length();i++) {
        //     char c=s.charAt(i);
        //     word+=c;
        //     if(c==' '){
        //         result=word.trim()+" "+result.trim();
        //         word="";
        //     }     
        // }
        return result.trim();
    }
}