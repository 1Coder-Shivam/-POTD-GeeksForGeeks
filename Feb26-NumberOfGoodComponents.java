class Solution {
    int v_count;
    int e_count;
    boolean vis[];
    public int findNumberOfGoodComponent(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        vis = new boolean[V+1];
        //dfs for all vertices
        int ans=0;
        for(int i=1; i<=V; i++){
            if(!vis[i]){
                v_count=e_count=0;
                dfs(adj, i);
            
            if(e_count == (v_count *(v_count-1))) ans++;
            }
        }
        return ans;
    }
    void dfs(ArrayList<ArrayList<Integer>> adj, int st){
        vis[st]=true;
        v_count++; e_count += adj.get(st).size();
        //itr for nei
        for(int nei : adj.get(st) ){
            if(!vis[nei])
             dfs(adj, nei);
        }
    }
}
