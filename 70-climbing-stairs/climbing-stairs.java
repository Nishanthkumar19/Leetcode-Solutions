class Solution {
    int []dp;
    public int climbStairs(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return ways(n);
    }
    public int ways(int n){
        if(n<=3){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        else{
            dp[n]=ways(n-1)+ways(n-2);
            return dp[n];
        }
    } 
}