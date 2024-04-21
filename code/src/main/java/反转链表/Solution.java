package 反转链表;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: Solution
 * Package: 反转链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 17:40
 * @Version 1.0
 */
public class Solution {
    public ListNode reverseList(ListNode head) {

            ListNode curr=head;
            ListNode prev=null;

        while (curr != null) {
            ListNode nextTemp = curr.next; // 暂存当前节点的下一个节点  nexttemp=2,3,4,5
            curr.next = prev; // 将当前节点的 next 指针指向前一个节点   head->null
            prev = curr; // 更新 prev 指针为当前节点  head->head
            curr = nextTemp; // 移动 curr 指针到下一个节点
        }
        return prev;

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
        Solution solution = new Solution();
        ListNode reversedList = solution.reverseList(head);

        // 打印反转后的链表
        while (reversedList != null) {
            System.out.print(reversedList.val + " ");
            reversedList = reversedList.next;
        }
    }
}
