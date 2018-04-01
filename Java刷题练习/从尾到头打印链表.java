package Java刷题练习;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dela on 3/31/18.
 */
public class 从尾到头打印链表 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode head = null;
        ListNode p = null;
        ListNode q = head;

        for (int i = 0; i < 5; i++) {
            p = new ListNode(scanner.nextInt());
            p.next = null;

            if (head == null) {
                head = p;
            } else {
                q.next = p;
            }
            q = p;
        }

        ArrayList<Integer> result = printListFromTailToHead(head);
        System.out.println(result);
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayDeque<ListNode> stack = new ArrayDeque<>();

        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop().val);
        }

        return result;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    public ListNode (int val) {
        this.val = val;
    }
}