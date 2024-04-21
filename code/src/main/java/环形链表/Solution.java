package 环形链表;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: Solution
 * Package: 环形链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/21 21:45
 * @Version 1.0
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }

    return false;
    }
    /**
     *
     * @author khr
     * @date 2024-04-21
     */
    @Test
    public void test(){
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // 链表中不存在环
        Solution solution = new Solution();
        boolean hasCycle = solution.hasCycle(head);
        System.out.println("链表中是否存在环：" + hasCycle); // 预期结果为 false

        // 创建一个环形链表：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 3
        node6.next = node3;

        // 链表中存在环
        hasCycle = solution.hasCycle(head);
        System.out.println("链表中是否存在环：" + hasCycle); // 预期结果为 true
    }
    }

