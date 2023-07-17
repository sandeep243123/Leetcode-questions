class Solution {
    boolean chk(int arr1[],int arr2[]){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
    
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        int k=0;
        int arr[]=new int[pattern.length()];
        ArrayList<String> str=new ArrayList<String>();
        
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),map.get(pattern.charAt(i)));
            }else{
               map.put(pattern.charAt(i),k++); 
            }
            arr[i]=map.get(pattern.charAt(i));
        }
        map.clear();
        
        for(int i=0;i<words.length;i++){
            int pt[]=new int[words[i].length()];
            k=0;
            for(int j=0;j<words[i].length();j++){
                if(map.containsKey(words[i].charAt(j))){
                    map.put(words[i].charAt(j),map.get(words[i].charAt(j)));
                }else{
                map.put(words[i].charAt(j),k++); 
                }
                pt[j]=map.get(words[i].charAt(j));
                
            }
            if(chk(pt,arr))
                str.add(words[i]);
             map.clear();   
        }
        return str;
    }
}