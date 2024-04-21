package 相交链表;

/**
 * ClassName: Solution2
 * Package: 相交链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 17:28
 * @Version 1.0
 */
public class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA=headA;
        ListNode pB=headB;
        if(headA==null || headB==null){
            return null;
        }


        else {
            while (headA!=headB){
               headA=headA==null?pB:headA.next;
               headB=headB==null?pA:headB.next;
            }
            return headA;
        }


    }

}
