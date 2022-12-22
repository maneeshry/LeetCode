class Solution {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      ListNode l1=list1;
      ListNode l2=list2;
      ListNode head = l1.val<=l2.val? l1:l2;
      ListNode curr = head;
          
      while(l1 != null || l2 != null) {
          if(l1.val<=l2.val) {              
              curr.next = l2;
              l1 = l1.next;
          } else {      
              curr.next = l1;
              l2 = l2.next;
          }
          curr = curr.next;
      }
    
      curr.next = l1 == null? l2:l1;
      
      return curr;
  }
}