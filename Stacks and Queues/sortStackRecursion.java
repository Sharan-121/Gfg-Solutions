import java.util.Stack;

public class sortStackRecursion {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(11);
        stk.push(2);
        stk.push(32);
        stk.push(3);
        stk.push(41);
        popElements(stk);
        System.out.println(stk);
    }

    public static void popElements(Stack<Integer> stk){
        if(stk.size() > 0){
            int x = stk.peek();
            stk.pop();
            popElements(stk);
            findMinAndInsert(stk,x);
        }
    }

    public static void findMinAndInsert(Stack<Integer> stk,int x){
        if(stk.isEmpty() || x > stk.peek()){
            stk.push(x);
        }
        else{
            if(stk.peek() >= x){
                int temp = stk.peek();
                stk.pop();
                findMinAndInsert(stk, x);
                stk.push(temp);
            }
        }
    }
}
