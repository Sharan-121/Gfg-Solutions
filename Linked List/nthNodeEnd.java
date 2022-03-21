class LinkedList {
    Node head;

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    void pushNewData(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void nthNodeFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;
        int count = 0;
        while (count < n) {
            fast = fast.next;

            count++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    void printMiddle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

}

// One approach would be to calculate length of the linked list and then print
// l-nth node from beginning.
// Next one is two pointer approach.

public class nthNodeEnd {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);
        obj.pushNewData(5);
        obj.pushNewData(6);

        // obj.nthNodeFromEnd(obj.head, 4);
        obj.printMiddle();

    }
}
