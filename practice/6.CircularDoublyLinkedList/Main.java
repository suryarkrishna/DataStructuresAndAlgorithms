package CircularDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCdll(5);
        cdll.insertNode(8, 0);
        System.out.println("--------");
        cdll.traverse();
        cdll.insertNode(7, 0);
        System.out.println("--------");
        cdll.traverse();
        cdll.insertNode(6, 1);
        System.out.println("--------");
        cdll.traverse();
        cdll.insertNode(9, 9);
        System.out.println("--------");
        cdll.traverse();
        cdll.deleteNode(0);
        System.out.println("--------");
        cdll.traverse();
        cdll.deleteNode(1);
        System.out.println("--------");
        cdll.traverse();
        cdll.deleteNode(9);
        System.out.println("--------");
        cdll.traverse();
        cdll.deleteCdll();
        System.out.println("--------");
        cdll.traverse();
    }
}

class CircularDoublyLinkedList {

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int nodeValue) {
            this.value = nodeValue;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    // creation
    public Node createCdll(int nodeValue) {
        Node node = new Node(nodeValue);
        head = tail = node;
        node.prev = node;
        node.next = node;
        size = 1;
        return head;
    }

    // insertion
    public void insertNode(int nodeValue, int location) {
        Node node = new Node(nodeValue);
        if (head != null) {
            if (location == 0) {
                node.next = head;
                head.prev = node;
                node.prev = tail;
                tail.next = node;
                head = node;
                size++;
            } else if (location >= size) {
                node.next = head;
                head.prev = node;
                tail.next = node;
                node.prev = tail;
                tail = node;
                size++;
            } else {
                Node current = head;
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                node.next = current.next;
                current.next = node;
                node.prev = current;
                node.next.prev = node;
                size++;
            }
        }
    }

    // traverse
    public void traverse() {
        if (head != null) {
            Node current = head;
            for (int i = 0; i < size; i++) {
                System.out.print(current.value);
                current = current.next;
                System.out.print(i != size - 1 ? "<=>" : "");
            }
        } else {
            System.out.println("linkedlist doesnot exist");
        }
        System.out.println();
    }

    // delete
    public void deleteNode(int location) {
        if (head != null) {
            if (location == 0) {
                head = head.next;
                tail.next = head;
                head.prev = tail;
                size--;
            } else if (location >= size) {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
                size--;
            } else {
                Node current = head;
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                current.next.prev = current;
                size--;
            }

        }
    }

    // delete ll
    public void deleteCdll() {
        tail.next = null;
        head.prev = null;
        Node current = head;
        for (int i = 0; i < size; i++) {
            current.prev = null;
            current = current.next;
        }
        head = tail = null;
        size = 0;

    }
}
