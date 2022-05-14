
import java.util.*;

// public class largestRect {

//     public static void main(String[] args) {

//     }
// }

class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) {
        long top = 0;
        long maxArea = 0;
        long currentArea = 0;
        long i = 0;

        Stack<Long> stk = new Stack<>();

        while (i < n) {
            if (stk.isEmpty() || hist[stk.peek().intValue()] <= hist[(int) i]) {
                stk.push(i++);
            } else {
                top = stk.peek();
                stk.pop();

                currentArea = hist[(int) top] * (stk.isEmpty() ? i : i - stk.peek() - 1);

                if (currentArea > maxArea) {
                    maxArea = currentArea;
                }
            }
        }

        while (!stk.isEmpty()) {
            top = stk.peek();
            stk.pop();
            currentArea = hist[(int) top] * (stk.isEmpty() ? i : i - stk.peek() - 1);

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }

        }

        return maxArea;

    }

}
