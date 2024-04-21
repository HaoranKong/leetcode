package 相交链表;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: Solution
 * Package: 相交链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 17:08
 * @Version 1.0
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {




        Set<ListNode> set=new HashSet<ListNode>();
        while(headA!=null)
        {
            set.add(headA);
            headA=headA.next;
        }
        while (headB!=null)
        {
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}