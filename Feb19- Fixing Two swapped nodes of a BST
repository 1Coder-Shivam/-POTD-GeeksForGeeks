class Solution {
    Node prev;
    Node first;
    Node mid;
    Node last;
    public Node correctBST(Node root) {
        // code here.
        first = mid=last=null;
        prev = new Node(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last!=null){
            int t=first.data;
            first.data=last.data;
            last.data=t;
        }else{
            int t=first.data;
            first.data=mid.data;
            mid.data=t;
        }
        return root;
    }
    
    void inorder(Node root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null && (root.data<prev.data)){
            if(first==null){
                first=prev;
                mid=root;
            }else last = root;
        }
        prev=root;
        inorder(root.right);
    }
}
