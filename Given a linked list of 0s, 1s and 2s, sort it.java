class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node z = new Node(-1);
        Node zz = z;
        
        Node o = new Node(-1);
        Node oo = o;
        
        Node t = new Node(-1);
        Node tt = t;
        
        Node cur = head;
        
        while(cur!=null)
        {
            if(cur.data==0)
            {
                zz.next = new Node(0);
                zz = zz.next;
            }
            else if(cur.data==1)
            {
                oo.next = new Node(1);
                oo = oo.next;
            }
            else
            {
                tt.next = new Node(2);
                tt = tt.next;
            }
            cur = cur.next;
        }
        
        zz.next = (o.next!=null) ? (o.next) : (t.next); 
        oo.next = t.next; 
        tt.next = null;
        
        head = z.next;
        
        return head;
        
    }
}
