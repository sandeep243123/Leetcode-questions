class Solution {
    public int countSegments(String s) {    
        s=s.replaceAll("( )+"," ");
        s=s.trim();
        if(s.equals(""))
        return 0;
        String words[]=s.split("\\s");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        return words.length;
    }
}