package 合并两个有序链表;

import org.junit.Test;
import 相交链表.ListNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: Solution
 * Package: 合并两个有序链表
 * Description:
 *
 * @Author KHR
 * @Create 2024/4/22 15:27
 * @Version 1.0
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null || list1 == null)
            return list1 == null ? list2 : list1;
        ListNode listNode=new ListNode(0);
        ListNode current=listNode;
        List<Integer>list=new ArrayList<Integer>();
        while (list1!=null){
            list.add(list1.val);
            list1=list1.next;
        }
        while (list2!=null){
            list.add(list2.val);
            list2=list2.next;
        }
        Collections.sort(list);

        for(Integer i:list) {
           ListNode pre=current;
           current=new ListNode(i);
           pre.next=current;
        }
        return listNode.next;


    }

    /**
     * @author khr
     * @date 2024-04-22
     */
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        ListNode node2_l1 = new ListNode(2);
        ListNode node4_l1 = new ListNode(4);
        l1.next = node2_l1;
        node2_l1.next = node4_l1;

        ListNode l2 = new ListNode(1);
        ListNode node3_l2 = new ListNode(3);
        ListNode node4_l2 = new ListNode(4);
        l2.next = node3_l2;
        node3_l2.next = node4_l2;

        // 合并两个升序链表
        Solution solution = new Solution();
        ListNode mergedList = solution.mergeTwoLists(l1, l2);

        // 打印合并后的链表
        while (mergedList != null) {
            System.out.print(mergedList.val + " ");
            mergedList = mergedList.next;
        }
    }

}
