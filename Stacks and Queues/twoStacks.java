class ArrayStacks {
    int capacity;
    int array[];
    int top1, top2;

    ArrayStacks(int capacity) {
        this.capacity = capacity;
        this.top1 = -1;
        this.top2 = capacity;
        array = new int[capacity];
    }

    void push1(int data) {
        if (top1 + 1 < top2) {
            array[++top1] = data;
        }
    }

    void push2(int data) {
        if (top2 - 1 > top1) {
            array[--top2] = data;
        }
    }

    int pop1() {
        if (top1 == -1) {
            return -1;
        }
        return array[top1--];
    }

    int pop2() {
        if (top2 == capacity) {
            return -1;

        }
        return array[top2++];
    }
}

public class twoStacks {
    public static void main(String[] args) {
        ArrayStacks obj = new ArrayStacks(5);
        obj.push1(1);
        obj.push2(5);
        obj.push1(2);
        obj.push2(4);
        obj.push1(3);
        
        System.out.println(obj.pop1());
        System.out.println(obj.pop2());
    }
}
