class DDL{
    class DDLNode{
        DDLNode prev;
        int data;
        DDLNode next;
        
        DDLNode(int data){
            this.data = data;
        }
    }

    class MyStack{
        DDLNode head;
        DDLNode mid;
        int count;

        MyStack(){
            this.count = 0;
        }
        void push(int new_data){
            DDLNode newNode = new DDLNode(new_data);
            newNode.prev =null;
            newNode.next = this.head;
            this.count = this.count + 1;

            if(this.count == 1){
                this.mid = newNode;
            }
            else{
                this.head.prev = newNode;
                if(count % 2 != 0){
                    this.mid = this.mid.prev;
                }
            }
            this.head = newNode;
        }

        int pop(){
            if(this.count == 0){
                return - 1;
            }
            DDLNode temp = this.head;
            int item = temp.data;

            this.head = this.head.next;
            if(this.head != null){
                this.head.prev = null;
            }
            this.count -=1;

            if(this.count % 2 == 0){
                this.mid = this.mid.next;
            }
            return item;
        }
        void printMiddle(){
            if(this.count == 0){
                return;
            }
            System.out.println(this.mid.data);
        }
        void deleteMiddle(){
            if(this.count == 1){
                return;
            }
            DDLNode midPrev = mid.prev;
            DDLNode midNext = mid.next;
            midPrev.next = midNext;
            midNext.prev = midPrev;
            mid.next = mid.prev = null;
            this.count--;

            if(count % 2 == 0){
                mid = midNext;
            }
            else{
                mid = midPrev;
            }
        }
    }
}

public class findMiddle {
    public static void main(String[] args) {
        DDL obj = new DDL();
        DDL.MyStack obj1 = obj.new MyStack();
        obj1.push(1);
        obj1.push(2);
        obj1.push(3);
        obj1.push(4);
        obj1.push(5);
        obj1.push(6);
        obj1.printMiddle();
        obj1.deleteMiddle();
        obj1.printMiddle();

        
    }
}
