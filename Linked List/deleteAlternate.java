class DeleteLinkedList {
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

    void deleteAlternate() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow.next.next = null;
            slow.next = fast;
            slow = slow.next;

        }
    }

}

public class deleteAlternate {
    public static void main(String[] args) {
        DeleteLinkedList obj = new DeleteLinkedList();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);

        obj.deleteAlternate();
        obj.printData();
    }
}
