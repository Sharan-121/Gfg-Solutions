import java.util.HashSet;

class LinkedList{
    Node head;
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    void pushNewData(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    void printData(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void removeDuplicate(){
        HashSet<Integer> hs = new HashSet<>();

        Node current = head;
        Node prev = null;

        while(current != null){
            int currentData = current.data;

            if(hs.contains(currentData)){
                prev.next = current.next;
            }
            else{
                hs.add(currentData);
                prev = current;
            }
            current = current.next;
        }
    }

}

public class unsortedDuplicates {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.pushNewData(1);
        obj.pushNewData(5);
        obj.pushNewData(5);
        obj.pushNewData(3);
        obj.pushNewData(3);
        obj.pushNewData(2);
        obj.removeDuplicate();
        obj.printData();
    }
}
