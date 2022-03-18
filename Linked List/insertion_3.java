
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insertion_3 {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        second.next = third;

        // Insertion at beginning.
        Node newNode = new Node(4);
        newNode.next = head;
        head = newNode;


        // Insert after a given node.
        Node newNode1 = new Node(5);
        newNode1.next = second.next;
        second.next = newNode1;

        
        // Insertion at end.


        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node lastNode = new Node(6);
        temp.next = lastNode;

        Node headref = head;
        while(headref != null){
            System.out.println(headref.data);
            headref= headref.next;
        }

    }
}