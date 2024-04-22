package 合并两个有序链表;

import org.junit.Test;
import 相交链表.ListNode;

import javax.lang.model.util.ElementScanner6;

/**
 * ClassName: digui
 * Package: 合并两个有序链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/22 16:21
 * @Version 1.0
 */
public class digui {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null)
            return list1 == null ? list2 : list1;
        ListNode head=list1.val<=list2.val?list1:list2;
        ListNode prev=new ListNode(Math.min(list1.val, list2.val));

        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                prev.next=list1;
                prev=list1;
                list1=list1.next;
            }
            else
            {
                prev.next=list2;
                prev=list2;
                list2=list2.next;
            }
        }
        prev.next=list1==null?list2:list1;
        return head;

    }
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);


        ListNode l2 = null;


        // 合并两个升序链表

        ListNode mergedList = mergeTwoLists(l1, l2);

        // 打印合并后的链表
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }
}
