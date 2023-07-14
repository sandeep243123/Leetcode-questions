class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
       LinkedList<String>li=new LinkedList<String>();
       for(int i=0;i<words.length;i++){
           li.add(words[i]);
       }
       while(li.size()!=0){
           StringBuilder sb=new StringBuilder(li.remove());
           String st=sb.reverse().toString();
           if(li.indexOf(st)!=-1){
               count++;
               li.remove(li.indexOf(st));
           }
       } 
       return count;
    }
}