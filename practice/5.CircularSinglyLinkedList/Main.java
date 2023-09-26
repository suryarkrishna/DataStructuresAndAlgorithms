package CircularSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCsll(5);
        csll.insertInCsll(6, 0);
        csll.insertInCsll(10, 10);
        csll.insertInCsll(9, 2);
        csll.insertInCsll(11, 3);
        csll.insertInCsll(21, 4);
        csll.traverse();
        // System.out.println(csll.findNodebyIndex(3));
        // System.out.println("node found at "+csll.findNodebyValue(8));
        csll.deleteNodebyIndex(0);
        csll.traverse();
        csll.deleteNodebyIndex(10);
        csll.traverse();
        csll.deleteNodebyIndex(2);
        csll.traverse();
        csll.deleteCsll();
        csll.traverse();

    }
}

class Node {
    public int value;
    public Node next;
}

class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // create a csll
    public Node createCsll(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = tail = node;
        size = 1;
        return head;
    }

    // insert at a location
    public void insertInCsll(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCsll(nodeValue);
            return;
        } else if (location == 0) {
            node.next = head;
            tail.next = head = node;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // traversal of circular singly linkedlist
    public void traverse() {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
            return;
        }
        Node current = head;
        for (int i = 0; i < size; i++) {

            System.out.print(current.value);
            current = current.next;
            System.out.print(i != size - 1 ? "->" : "");
        }
        System.out.println();
    }

    // find node by Index i.e returns the value of the index
    public int findNodebyIndex(int location) {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == location) {
                    return current.value;
                }
                current = current.next;
            }
        }
        return -1;
    }

    // find node by value i.e return the index of value
    public int findNodebyValue(int nodeValue) {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (current.value == nodeValue) {
                    return i;
                }
                current = current.next;
            }
        }
        return -1;
    }

    // delete node by Index
    public void deleteNodebyIndex(int location) {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
            return;
        } else if (location == 0) {
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                head.next = null;
                tail = head = null;
            }

        } else if (location >= size) {
            Node current = head;
            for (int i = 0; i < size - 1; i++) {
                current = current.next;
            }
            if (current == head) {
                current.next = null;
                head = tail = null;
                return;
            } else {
                current.next = head;
                tail = current;
                size--;
            }

        } else {
            Node current = head;
            for (int i = 0; i < location - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
            size--;
        }
    }

    public void deleteCsll() {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
            return;
        } else {
            head = null;
            tail.next = null;
            tail = null;
            size = 0;
            System.out.println("linkedlist is successfully deleted");
        }
    }
}
