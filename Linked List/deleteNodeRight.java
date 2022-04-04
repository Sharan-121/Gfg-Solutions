
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

    public void pushNewData(int data) {
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

    public void printData() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteGreaterRight() {

        Node current = head;
        Node prev = null;
        while (current.next != null) {
            Node pointer = current.next;
            Node next = current.next;
            while (pointer != null) {

                if (pointer.data > current.data && current == head) {
                    this.head = pointer;
                    current.next = null;
                    break;
                }
                if (pointer.data > current.data && current != head) {
                    prev.next = current.next;
                    current.next = null;
                    break;

                }

                pointer = pointer.next;

            }
            prev = current;
            current = next;
        }
    }

}

public class deleteNodeRight {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        // obj.pushNewData(50);
        // obj.pushNewData(40);
        // obj.pushNewData(30);
        // obj.pushNewData(20);

        // obj.pushNewData(10);

        obj.pushNewData(20);
        obj.pushNewData(10);
        obj.pushNewData(20);
        obj.pushNewData(10);
        obj.pushNewData(11);
        obj.pushNewData(5);
        obj.pushNewData(6);
        obj.pushNewData(2);
        obj.pushNewData(3);

        obj.deleteGreaterRight();
        obj.printData();
    }
}
