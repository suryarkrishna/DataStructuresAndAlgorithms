package interviewPrep;

import java.util.HashSet;
import java.util.Set;

public class Questions {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.insertNode(3);
        ll.traverse();
        System.out.println("----");
        ll.deleteDups(ll);
    }
}

class Node {
    int value;
    Node next;
    Node prev;

    public Node(int nodeValue) {
        this.value = nodeValue;
    }
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    void createLinkedList(int nodeValue) {
        Node node = new Node(nodeValue);
        head = tail = node;
        node.next = null;
        size = 1;
    }

    void insertNode(int nodeValue) {
        Node node = new Node(nodeValue);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    void traverse() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            System.out.print(current.value);
            System.out.print(i != size - 1 ? "->" : "");
            current = current.next;
        }
        System.out.println();
    }

    void deleteNode(int nodeValue) {
        Node current = head;
        while (current.next != null) {
            if (current.next.value == nodeValue) {
                current.next = current.next.next;
                if (current.next == null) {
                    tail = current;
                }
            }
            current = current.next;
        }
        size--;
    }

    public void deleteDups(LinkedList ll) {
        // remove duplicates
        // two for loops
        // each one checking with other
        // LinkedList newLL = new LinkedList();
        // Node current = ll.head;
        // newLL.createLinkedList(current.value);
        // while (current.next != null) {
        //     if (newLL.tail.value != current.value) {
        //         newLL.insertNode(current.value);
        //     }
        //     current = current.next;
        // }
        // newLL.traverse();
        Set<Integer> set = new HashSet<>();
        Node current = ll.head;
        Node prev = null;
        while(current != null) {
            int curval = current.value;
            if(set.contains(curval)){
                prev.next = current.next;
                ll.size--;
            }else{
                set.add(curval);
                prev = current;
            }
            current = current.next;
        }
        ll.traverse();
        

    }

}
