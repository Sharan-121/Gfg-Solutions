import java.util.Stack;

public class paranthesis {
    public static void main(String[] args) {

    }

    public static boolean isPair(String x) {
        if (x.length() == 1) {
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (char ch : x.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            } else {
                if (stk.isEmpty() || ch == ')' && stk.peek() != '(' ||
                        ch == '}' && stk.peek() != '{' || ch == ']' && stk.peek() != '[') {
                    return false;
                }
                stk.pop();
            }
        }
        return stk.empty() ? true : false;
    }
}