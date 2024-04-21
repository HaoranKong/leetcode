package 回文链表;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: Solution
 * Package: 回文链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 21:17
 * @Version 1.0
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null)
            return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode reverseList = reverseList(slow);
        while(reverseList.next!=null)
        {
            if(reverseList.val!=head.val)
               return false;
            reverseList=reverseList.next;
            head=head.next;
        }

        return true;
    }
    private ListNode reverseList(ListNode head) {
        ListNode ans = null;
        for (ListNode x = head; x != null; x = x.next) {
            ans = new ListNode(x.val,ans);
        }
        return ans;
    }
    /**
     *
     * @author khr
     * @date 2024-04-21
     */
    @Test
    public void test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
//        head.next.next.next.next.next = new ListNode(6);
        System.out.println(isPalindrome(head));
    }
}
