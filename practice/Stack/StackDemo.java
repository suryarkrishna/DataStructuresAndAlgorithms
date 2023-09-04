package Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.push(5);        
        stack.push(6);
        stack.push(7);        
        stack.push(8);
        int res = stack.pop();
        System.out.println(res);
    }
}

class Stack {
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with the size of "+size);
    }

    boolean isEmpty() {
        if(topOfStack == -1){
            return true;
        }
        else {
            return false;
        }
    }

    boolean isFull() {
        if(topOfStack == arr.length-1){
            return true;
        } else {
            return false;
        }
    }

    //push
    void push(int value) {
        if(isFull() ) {
            System.out.println("stack is full");
        }else {
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //pop
    int pop(){
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }



}
