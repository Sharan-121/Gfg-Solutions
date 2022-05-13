// import java.util.*;

public class celebrity {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 0 }, { 0, 0, 0 }, { 0, 1, 0 } };
        int n = arr.length;
        System.out.println(celebritysoln(arr, 3));

    }

    public static int celebritysoln(int matrix[][], int n) {
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (matrix[j][i] == 1) {
                j--;
            } else {
                i++;
            }
        }
        int candidate = i;

        for (int k = 0; k < n; k++) {
            if (k != candidate) {
                if (matrix[candidate][k] == 1 || matrix[k][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;

    }

}
