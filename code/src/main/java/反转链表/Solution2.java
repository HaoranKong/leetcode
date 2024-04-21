package 反转链表;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: Solution2
 * Package: 反转链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 21:07
 * @Version 1.0
 */
public class Solution2 {
    public ListNode reverseList(ListNode head) {
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
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 反转链表

        ListNode reversedList = reverseList(head);

        // 打印反转后的链表
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}