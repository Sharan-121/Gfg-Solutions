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
            int count = 1;
            while(fast.next != slow){
                fast = fast.next;
                count++;
            }
            System.out.println("yes "+count);

        }
        else{
            System.out.println("No");
        }

    }
}
public class floydCycle {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.pushNewData(1);
        obj.pushNewData(2);
        obj.pushNewData(3);
        obj.pushNewData(4);
        obj.pushNewData(5);
        obj.pushNewData(6);

        obj.head.next.next.next.next.next.next = obj.head.next;
        obj.detectCycle();

    }
}
