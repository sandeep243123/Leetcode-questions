class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String str="";
        String w[]=s.split(" ");
        for(int i=w.length-1;i>=0;i--){
            if(w[i].trim() == ""){
                continue;
            }
            str= str + " " + w[i];
        }
        s=str.trim();
        return s;
    }
}