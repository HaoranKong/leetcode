package 环形链表ii;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: own
 * Package: 环形链表ii
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/22 14:51
 * @Version 1.0
 */
public class own {
    public ListNode detectCycle(ListNode head){
        if(head == null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                while (slow.next!=null)
                {
                    if(slow==head)
                        return slow;
                    slow=slow.next;
                    head=head.next;

                }
                break;
            }

        }



        return null;
    }
    @Test
    public void test(){
        // 创建一个链表：1 -> 2 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);


        head.next = node2;
        node2.next = head;

        // 链表中存在环

        ListNode cycleStart = detectCycle(head);

        System.out.println("链表中环的入口节点：" + cycleStart.val); // 预期结果为 3
    }

}
