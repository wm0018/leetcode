package leetcode;

/**
 * 2. Add Two Numbers
 * @author Wu
 * 2018年3月23日
 */
public class Problem2 {

	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	class Solution {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int i = 0;
	        int left = 0;
	        int sum = l1.val+l2.val+left;
	        i = sum%10;
	        left = sum/10;
	        ListNode a = new ListNode(i);
	        ListNode ret = a;
	        l1 = l1.next;
	        l2 = l2.next;
	        while(l1!=null||l2!=null){
	            int t1 = 0;
	            int t2 = 0;
	            if(l1!=null){
	                t1 = l1.val;
	                l1 = l1.next;
	            }
	            if(l2!=null){
	                t2 = l2.val;
	                l2 = l2.next;
	            }
	            sum = t1+t2+left;
	            left = sum/10;
	            i = sum%10;
	            ListNode b = new ListNode(i);
	            a.next = b;
	            a = b;
	        }
	       if(left!=0){
	        a.next = new ListNode(left);
	       }
	        return ret;
	    }
	}
}
