import java.util.Stack;

public class reverseStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);

        System.out.println(stk);
        reverse(stk);
        System.out.println(stk);

    }

    public static void insertAtBottom(Stack<Integer> stk, int x) {
        if (stk.isEmpty()) {
            stk.push(x);
        } else {
            int peek = stk.peek();
            stk.pop();
            insertAtBottom(stk, x);
            stk.push(peek);
        }
    }

    public static void reverse(Stack<Integer> stk) {
        if (stk.size() > 0) {
            int peek = stk.peek();
            stk.pop();
            reverse(stk);
            insertAtBottom(stk, peek);
        }
    }
}
