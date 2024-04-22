package 环形链表ii;

import org.junit.Test;
import 相交链表.ListNode;

import java.util.HashSet;

/**
 * ClassName: Solution
 * Package: 环形链表ii
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/22 14:44
 * @Version 1.0
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode>hashSet =new HashSet<ListNode>();
        int size=hashSet.size();
        while(head!=null){

            hashSet.add(head);
            if(size==hashSet.size()){
                return head;
            }
            head=head.next;
            size=hashSet.size();
        }




        return null;
    }
    /**
     *
     * @author khr
     * @date 2024-04-22
     */
    @Test
    public void test(){
        // 创建一个链表：1 -> 2 -> 3 -> 4 -> 5 -> 6
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
        ListNode cycleStart = solution.detectCycle(head);
        System.out.println("链表中环的入口节点：" + cycleStart); // 预期结果为 null

        // 创建一个环形链表：1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 3
        node6.next = node3;

        // 链表中存在环
        cycleStart = solution.detectCycle(head);
        System.out.println("链表中环的入口节点：" + cycleStart.val); // 预期结果为 3
    }
}