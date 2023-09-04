package Stack;

public class StackLinkedList {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        int res = stack.pop();
        System.out.println(res);
    }
}
class Stack {
    SinglyLinkedList ll;

    public Stack(){
        ll = new SinglyLinkedList();
    }

    //push
    void push(int value) {
        ll.insertInLinkedList(value, 0);
    }

    //pop();
    int pop() {
        int res =  ll.head.value;
        ll.deleteNodebyValue(res);
        return res;
    }

}

class Node {
    public int value;
    public Node next;
}

class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSll(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size++;
        return head;
    }

    // insert method
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSll(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // traverse linkedlist
    public void traverse() {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println();
    }

    // find node
    public void findNode(int nodeValue) {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (current.value == nodeValue) {
                    System.out.print(nodeValue + " found at -> " + i);
                    break;
                }
                current = current.next;
            }
        }
        System.out.println();
    }

    // delete a node by index
    public void deleteNodebyIndex(int location) {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
            return;
        }
        if (location < 0 || location >= size) {
            System.out.println("Check the index entered.");
            return;
        }else if (location == 0) {
            head = head.next;
            size--;
            if( size == 0){
                tail = null;
            }
        }
        Node current = head;
        for (int i = 0; i < location - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next == null) {
            tail = current;
        }
        size--;

    }

    // delete a node by value
    public void deleteNodebyValue(int nodeValue) {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        }
        if (head.value == nodeValue) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == nodeValue) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current;
                }
                size--;
                return;
            }
            current = current.next;
        }
    }
    //delete entire singly linkedlist
    public void deletell() {
        tail = head = null;
        System.out.println("sll deleted successfully.");
    }
}