class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i=0;
        int c=coins;
        int t=0;
        if(costs.length==0 || costs[0]>coins){
            return 0;
        }
        while(costs[i]<=c && i<costs.length-1){
            t+=1;
            c-=costs[i];
            i++;
        

        }
        if(costs[costs.length-1]<=c){
            t+=1;
        }
        
        return t;

        
    }
}