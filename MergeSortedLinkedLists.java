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

 import java.util.*;
class MergeSortedLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        
        else if(list2 == null){
            return list1;
        }
        
        if(list1.val >= list2.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        
        ListNode res = list1;
        
        while(list1 != null && list2 != null){
            ListNode temp = null;
            
            while(list1 != null && list1.val <= list2.val){
                temp = list1;
                list1 = list1.next;
            } 
            
            temp.next = list2;
            
            ListNode temp1 = list1;
            list1 = list2;
            list2 = temp1;
        }
        
        return res;
    }
}