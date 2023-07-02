class Solution {
    public int balancedStringSplit(String s) {
        int count=0,sl=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                sl++;
            else
                sl--;
            if(sl==0)
                count+=1;
        }
        return count;
        
    }
}