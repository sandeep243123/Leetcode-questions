class Solution {
    int count(int[][] points,int x,int y,int r){
        int c=0;
        for(int i=0;i<points.length;i++){
            double d=Math.sqrt(Math.pow(x-points[i][0],2)+Math.pow(y-points[i][1],2));
            if(d<=r){
                c++;
            }
        }
        return c;
    }
    public int[] countPoints(int[][] points, int[][] queries) {
        int arr[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            arr[i]=count(points,queries[i][0],queries[i][1],queries[i][2]);
        }
        return arr;
    }
}