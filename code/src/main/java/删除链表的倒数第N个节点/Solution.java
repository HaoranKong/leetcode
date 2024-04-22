package 删除链表的倒数第N个节点;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: Solution
 * Package: 删除链表的倒数第N个节点
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/22 20:51
 * @Version 1.0
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dump=new ListNode(1);
        dump.next=head;


        ListNode slow = dump;
        ListNode fast = dump;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        ;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(slow.next!=null)
        {
        slow.next=slow.next.next;}
        else
            slow=null;

        if(slow==dump)
            return slow.next;

        return head;
    }
    /**
     *
     * @author khr
     * @date 2024-04-22
     */
    @Test
    public void test(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // 删除链表的倒数第 n 个节点
        Solution solution = new Solution();
        ListNode result = solution.removeNthFromEnd(head, 5);

        // 打印删除节点后的链表
        System.out.print("删除倒数第2个节点后的链表：");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
