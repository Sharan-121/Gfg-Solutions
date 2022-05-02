class MyStack{
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    MyStack(int maxSize){
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int data){
        stackArray[++top] = data;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == maxSize-1;
    }
}
public class stackImplement{
    public static void main(String[] args) {
        MyStack obj = new MyStack(100);
        obj.push(90);
        obj.push(87);
        obj.push(76);
        System.out.println(obj.pop());
        System.out.println(obj.pop()); 
        System.out.println(obj.pop());   
        
    }
}