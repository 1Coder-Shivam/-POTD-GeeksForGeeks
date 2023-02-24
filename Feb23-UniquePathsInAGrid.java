class Solution {
    static int mod = 1000000007;
    static int uniquePaths(int n, int m, int[][] grid) {
        // code here
        if(grid[0][0]==0) return 0;
        n--;m--;
        if(grid[n][m]==0)return 0;
        long [][]dp=new long[n+1][m+1];
        dp[n][m]=1;
        for(int i=n;i>=0;i--){
            for(int j=m;j>=0;j--){
                if(grid[i][j]==1){
                    if(i+1<=n) dp[i][j]= dp[i+1][j];
                    if(j+1<=m) dp[i][j]= (dp[i][j]+dp[i][j+1])%mod;
                } 
            }
        }
        return (int)dp[0][0];

    }
};
