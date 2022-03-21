
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

    void search(int data) {

        if (head == null) {
            return;
        }
        Node temp = head;
        int count = -1;
        // Iterative approach
        while (temp != null) {
            count++;
            if (temp.data == data) {
                System.out.println("Yes element found at index " + count);
                return;
            }
            temp = temp.next;
        }

    }

}

public class search {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);
        obj.search(8);

    }
}
