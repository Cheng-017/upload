package test.upload;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public void test(String s) {
    	System.out.println("java branch");
    }
    
    public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode(int x) { val = x; }
    	  }
    	 
    	class Solution {
    	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	        int num1 = 0,num2 = 0;

    	        int result;

    	        ListNode resultNode = new ListNode(0);

    	        for(int i = 0;l1.next != null;i++){
    	            num1 += l1.val * Math.pow(10,i);
    	            l1 = l1.next;
    	        }

    	        for(int i = 0;l2.next != null;i++){
    	            num2 += l2.val * Math.pow(10,i);
    	            l2 = l2.next;
    	        }

    	        result = num1 + num2;

    	        for(int i = 0;result > 0;i++){
    	            int j = 0;
    	            j = result % 10;
    	            result = result / 10;
    	            resultNode.val = j;
    	            if(result > 0){
    	                ListNode n = new ListNode(0);
    	                resultNode.next = n;
    	                resultNode = resultNode.next;
    	            }
    	            
    	        }

    	        return resultNode;
    	    }
    	}
}
