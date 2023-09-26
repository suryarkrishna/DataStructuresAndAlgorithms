package Queues;

public class QueueDemo {
    public static void main(String[] args) {
        Queue  queue = new Queue(4);
        boolean res = queue.isFull();
        System.out.println(res);
        queue.enQueue(6);
    }
}
class Queue {
    int[] arr;
    int topOfQueue;
    int beginningOfQueue;

    public Queue(int size){
        arr = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("Queue is successfully created with size "+size);
    }

    public boolean isFull() {
        if(topOfQueue == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty() {
        if(beginningOfQueue == -1 || beginningOfQueue == arr.length){
            return true;
        }else {
            return false;
        }
    }

    public void enQueue(int value) {
        if(isFull()){
            System.out.println("queue is full");
        }else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted");
        }else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("successfully inserted");
        }

    }

    public int deQueue(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else {
            int res = arr[beginningOfQueue];
            arr[topOfQueue] = 0;
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return res;

        }
    }
    public int peek() {
        if(!isEmpty()){
            return arr[topOfQueue];
        }else{
            System.out.println("queue is empty");
            return -1;
        }
    }

    public void delete(){
        arr = null;
        System.out.println("queue is deleted");
    }

}

