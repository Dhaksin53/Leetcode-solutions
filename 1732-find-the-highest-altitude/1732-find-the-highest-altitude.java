class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans=new int[gain.length+1];
        ans[0]=0;
        int m=0;
        
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]+gain[i-1];
            if(ans[i]>m){
                m=ans[i];
            }
        }

    return m; 
        
    }
}