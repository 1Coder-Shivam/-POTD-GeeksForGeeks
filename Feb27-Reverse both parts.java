class Solution {
    public static Node reverse(Node head, int k) {
        // code here
        Node curr =head;
        Node prev = null,nxt=null;
        int cnt=0;
        while(curr!=null && k!=cnt){
            nxt = curr.next;
            curr.next =prev;
            prev = curr;
            curr = nxt;
            cnt++;  
        }
        Node prev2=null,curr2=nxt, nxt2=null;
        while(curr2!=null){
            nxt2 = curr2.next;
            curr2.next =prev2;
            prev2 = curr2;
            curr2 = nxt2;
              
        }
        head.next=prev2;
        return prev;
        
    }
}
