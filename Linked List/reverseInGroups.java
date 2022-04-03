class groupLinkedList {
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

    void printData(Node head) {
        Node temp = head;

    }

    Node reverse(Node head, int k, boolean b) {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node next = null;
        Node prev = null;
        int count = 0;

        while (count < k && current != null) {
            next = current.next;
            if (b == true) {
                current.next = prev;
            }
            prev = current;
            current = next;
            count++;
        }
        if (b == true) {
            head.next = reverse(current, k, !b);

            return prev;
        } else {
            prev.next = reverse(current, k, !b);

        }
        return head;
    }
}

public class reverseInGroups {
    public static void main(String[] args) {
        groupLinkedList obj = new groupLinkedList();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);
        obj.pushNewData(5);
        obj.pushNewData(6);
        obj.pushNewData(7);
        obj.pushNewData(8);

        obj.printData(obj.reverse(obj.head, 3, true));
    }
}
