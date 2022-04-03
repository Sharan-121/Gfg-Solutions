class LinkedListt {
    Node head;
    Node left;

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

    public boolean isPalindrome(Node right) {
        left = head;

        if (right == null) {
            return true;
        }

        boolean isPalindrome = isPalindrome(right.next);
        if (isPalindrome == false) {
            return false;
        }
        boolean currentCheck = (right.data == left.data);
        left = left.next;
        return currentCheck;
    }
}

public class palindrome {
    public static void main(String[] args) {
        LinkedListt obj = new LinkedListt();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);
        obj.pushNewData(5);
        obj.pushNewData(2);
        obj.pushNewData(1);
        System.out.println(obj.isPalindrome(obj.head));
    }
}
