class Solution {
    public int numberOfBeams(String[] bank) {
        int c1=0,c2=0,sum=0;
        for(int i=0;i<bank.length;i++){
            
            c2=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    c2++;
                }
            }
            sum+=c1*c2;
            if(c2!=0)
            {
                c1=c2;
            }
        }
        return sum;
    }
}