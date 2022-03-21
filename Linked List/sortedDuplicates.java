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
    void deleteDuplicates(){
        Node slow = head;
        Node fast = head.next;

        while(fast!= null && slow!=null){
            if(fast.data == slow.data){
                fast = fast.next;
            }
            else{
                slow.next = fast;
                slow = slow.next;
                fast = fast.next;
            }
        }
        if(slow != fast){
            slow.next= null;
        }


    }
    void printData(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public interface sortedDuplicates {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.pushNewData(1);
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(2);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(3);
       
        obj.deleteDuplicates();
        obj.printData();
    }
}
