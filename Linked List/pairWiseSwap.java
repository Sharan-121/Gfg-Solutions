
class LinkedList1{
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

    void pairWiseSwap1(){
        Node current = head;
        while(current != null && current.next != null){
            current.next = current.next.next;
            current.next.next= current;
            current = current.next;
        }
    }

}



public class pairWiseSwap {
    public static void main(String[] args) {
        LinkedList1 obj = new LinkedList1();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);
        obj.pushNewData(5);
        obj.pushNewData(6);
        obj.pairWiseSwap1();
        obj.printData();
    }
}
