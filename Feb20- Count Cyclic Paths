class Solution{
	public static int countPaths(int N){
		//code here
		long mod=1000000007l;
		if(N==1) return 0;
		 
		long [][]dp = new long[4][N+1];
		
        // Initial Position
        dp[0][0] = 1; //O
        dp[1][0] = 0; //A
        dp[2][0] = 0; //B
        dp[3][0] = 0; //C
        
        //Filling the dp[][]
        for(int i=1;i<=N;i++){
            long cntPosO= (dp[1][i-1]+dp[2][i-1]+dp[3][i-1])%mod;
            long cntPosA= (dp[0][i-1]+dp[2][i-1]+dp[3][i-1])%mod;
            long cntPosB= (dp[0][i-1]+dp[1][i-1]+dp[3][i-1])%mod;
            long cntPosC= (dp[0][i-1]+dp[1][i-1]+dp[2][i-1])%mod;
            
            dp[0][i] = cntPosO; 
            dp[1][i] = cntPosA; 
            dp[2][i] = cntPosB; 
            dp[3][i] = cntPosC; 
            
        }
        return (int)dp[0][N];
	}
}
