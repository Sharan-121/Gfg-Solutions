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
    void detectCycle(){
        Node fast = head;
        Node slow = head;
        int flag = 0;
        while(slow != null && fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 1){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}
public class floydCycle {
    public static void main(String[] args) {
        
    }
}
