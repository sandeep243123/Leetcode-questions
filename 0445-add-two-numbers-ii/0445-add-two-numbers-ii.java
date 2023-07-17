/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode h1=null,h2=null,h3=null;
       while(l1!=null){
           ListNode temp=new ListNode(l1.val);
           if(h1==null){
               h1=temp;
           }else{
               temp.next=h1;
               h1=temp;
           }
           l1=l1.next;
       }
       while(l2!=null){
           ListNode temp=new ListNode(l2.val);
           if(h2==null){
               h2=temp;
           }else{
               temp.next=h2;
               h2=temp;
           }
           l2=l2.next;
       }
       int c=0;

        while(h1!=null||h2!=null||c!=0){
            int val=0;
            if(h1!=null){
                val+=h1.val;
                h1=h1.next;
            }
            if(h2!=null){
                val+=h2.val;
                h2=h2.next;
            }
            val+=c;
            c=val/10;
            val=val%10;
            ListNode temp=new ListNode(val);
            if(h3==null){
                h3=temp;
            }else{
                temp.next=h3;
                h3=temp;
            }
        }
        return h3;
    }
}