package 两数相加;

import org.junit.Test;
import 相交链表.ListNode;

/**
 * ClassName: Solution
 * Package: 两数相加
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/22 16:56
 * @Version 1.0
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev=new ListNode(1);
        ListNode current=prev;
        ListNode head=prev;
        int flag=0;
        while (l1!=null||l2!=null) {
            int m=l1!=null?l1.val:0;
            int n=l2!=null? l2.val : 0;
            current=new ListNode((m+flag+n)%10);
            prev.next=current;
            prev=current;
            flag=(m+n+flag)/10;


            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        if (flag==1)
            prev.next=new ListNode(1);


      return head.next ;

    }
    /**
     *
     * @author khr
     * @date 2024-04-22
     */
    @Test
    public void test(){
        // 创建第一个链表：[9,9,9,9,9,9,9]
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

// 创建第二个链表：[9,9,9,9]
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);


        // 执行两数相加操作
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // 打印结果链表
        System.out.print("相加结果链表：");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
