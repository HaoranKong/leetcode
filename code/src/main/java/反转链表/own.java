package 反转链表;

import com.sun.xml.internal.ws.api.pipe.NextAction;
import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: own
 * Package: 反转链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 20:23
 * @Version 1.0
 */
public class own {

    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode prev=null;
        while (current!= null) {
            ListNode node=current.next;
            current.next=prev;
           prev=current;
           current=node;
        }


       return prev;
    }

    /**
     * @author khr
     * @date 2024-04-21
     */
    @Test
    public void test() {
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
