package Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

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


}
