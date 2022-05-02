
class MyQueue {
    int front, rear, size;
    int capacity;
    int array[];

    MyQueue(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        front = this.size = 0;
        rear = capacity - 1;
    }

    boolean isFull(MyQueue queue) {
        return queue.size == queue.capacity;
    }

    boolean isEmpty(MyQueue queue) {
        return queue.size == 0;
    }

    void enqueue(int data) {
        if (isFull(this)) {
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.array[rear] = data;
        this.size = this.size + 1;
        System.out.println(data + " Enqueued");

    }

    int dequeue() {
        if (isEmpty(this)) {
            return -1;
        }
        int item = this.array[front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }
}

public class queueImplement {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue(10);
        obj.enqueue(10);
        obj.enqueue(20);
        System.out.println(obj.dequeue());

    }
}
