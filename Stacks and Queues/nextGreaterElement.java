import java.util.Stack;

public class nextGreaterElement {
    // public static void main(String[] args) {
        
    // }
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> stk = new Stack<>();
        long ans[] =  new long[n];
        
        for(int i = n-1;i>=0;i--){
            
            while(!stk.isEmpty() && arr[i] > stk.peek()){
                stk.pop();
            }
            if(stk.isEmpty()){
                ans[i] = (long)-1;
            }
            else{
                ans[i] = stk.peek();
            }
            stk.push(arr[i]);
            
        }
        return ans;
        // Your code here
    } 
}
