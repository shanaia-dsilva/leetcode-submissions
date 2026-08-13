class Solution {
    public String reverseWords(String s) {
        s=s.trim()+" ";
        String result="",word="";

        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            word+=c;
            if(c==' '){
                result=word.trim()+" "+result.trim();
                System.out.println(word);
                word="";
            }     
        }
        return result.trim();
    }
}