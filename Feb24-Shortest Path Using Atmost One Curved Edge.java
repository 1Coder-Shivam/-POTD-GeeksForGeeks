//User function Template for Java
class Pair{
    int node;
    int dist;
    Pair(int node, int dist){
        this.node = node;
        this.dist= dist;
    }
}
class Solution {
    static int shortestPath(int n, int m, int a, int b, ArrayList<ArrayList<Integer>> edges) {
        // code here
        ArrayList<ArrayList<Pair>> ad  = new  ArrayList<>();
        ArrayList<ArrayList<Integer>> crv = new ArrayList<>();
        
        for(int i=0;i<=n;i++) ad.add(new ArrayList<>());
        
        for(ArrayList<Integer> x:edges){
            ad.get(x.get(0)).add(new Pair(x.get(1),x.get(2)));
            ad.get(x.get(1)).add(new Pair(x.get(0),x.get(2)));
            
            ArrayList<Integer> tmp = new ArrayList<>();
            tmp.add(x.get(0));
            tmp.add(x.get(1));
            tmp.add(x.get(3));
            crv.add(tmp);
        }
        int disA2B[] = Dijkshtra(ad,a,n);
        int disB2A[] = Dijkshtra(ad,b,n);
        int ans = disA2B[b];
        for(int i=0;i<m;i++){
            int u = crv.get(i).get(0);
            int v = crv.get(i).get(1);
            int cw = crv.get(i).get(2);
            ans = Math.min(ans, cw+disA2B[u]+disB2A[v]);
            ans = Math.min(ans, cw+disA2B[v]+disB2A[u]);
        }
        if(ans>=1000000007) return -1;
        return ans;
    }
    
    static int[] Dijkshtra( ArrayList<ArrayList<Pair>> ad, int s, int n){
        PriorityQueue<Pair> pq = new PriorityQueue<>((x ,y)-> x.dist - y.dist);

        int dist[] = new int[n+1];
        Arrays.fill(dist,1000000007);
        dist[s]= 0;
        pq.add(new Pair(s,0));
        while(!pq.isEmpty()){
            Pair z= pq.poll();
            int currDist = z.dist;
            int currNode = z.node;
            for(int i=0;i<ad.get(currNode).size();i++){
                int newDist = currDist+ad.get(currNode).get(i).dist;
                int newNode = ad.get(currNode).get(i).node;
                if(newDist<dist[newNode]){
                    dist[newNode]= newDist;
                    pq.add(new Pair(newNode,dist[newNode]));
                }
            }
        }
        return dist;
    }
};
