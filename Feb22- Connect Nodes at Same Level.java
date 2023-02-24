class Solution {
    Node temp;
    int ans=0;
    public void connect(Node root) {
        // code here
        Queue<Node> q = new LinkedList<Node>();
         q.add(root); 
 
        Node temp = null; 
        while (!q.isEmpty()) 
        {
            
            int n = q.size();
            for (int i = 0; i < n; i++) 
            {
                Node prev = temp;
                temp = q.poll();
 
                if (i > 0) prev.nextRight = temp;
                if (temp.left != null)  q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }
            temp.nextRight = null; // handling last ele of each level
        }
    }
}
