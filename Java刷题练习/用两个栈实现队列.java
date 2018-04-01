package Java刷题练习;

import java.util.Stack;

/**
 * Created by dela on 3/31/18.
 */
public class 用两个栈实现队列 {
    private static Stack<Integer> stack1 = new Stack<Integer>();
    private static Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        Mypush(6);
        for (int i = 0; i < 5; i++) {
            Mypush(i);
        }
        System.out.println(Mypop());
    }

    public static void Mypush(int node) {
        stack1.push(node);
    }

    public static int Mypop() {
        if (!stack2.empty()) {
            return stack2.pop();
        }

        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
}
