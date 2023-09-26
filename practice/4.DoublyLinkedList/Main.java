package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDll(5);
        // dll.traverse();
        dll.insertNode(6, 0);
        // dll.traverse();
        dll.insertNode(8, 0);
        // dll.traverse();
        dll.insertNode(9, 6);
        // dll.traverse();
        dll.insertNode(4, 1);
        dll.traverse();
        // dll.reverse();
        // dll.find(3);
        dll.deleteNodebyIndex(0);
        dll.traverse();
        dll.deleteNodebyIndex(2);
        dll.traverse();
        dll.deleteNodebyIndex(9);
        dll.traverse();
        dll.deleteDll();
        dll.traverse();
    }
}

class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // create doubly linkedlist
    public Node createDll(int nodeValue) {
        Node node = new Node(nodeValue);
        head = tail = node;
        node.prev = null;
        node.next = null;
        size = 1;
        return head;
    }

    // insert a node
    public void insertNode(int nodeValue, int location) {
        if (head == null) {
            createDll(nodeValue);

            return;
        } else {
            Node node = new Node(nodeValue);
            if (location == 0) {
                node.prev = null;
                node.next = head;
                head.prev = node;
                head = node;
                size++;
            } else if (location < size) {
                Node current = head;
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                node.next = current.next;
                node.next.prev = node;
                node.prev = current;
                current.next = node;
                size++;
            } else if (location >= size) {
                node.next = null;
                node.prev = tail;
                tail.next = node;
                tail = node;
                size++;
            }
        }

    }

    // traverse
    public void traverse() {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        } else {
            Node current = head;
            for (int i = 0; i < size; i++) {
                System.out.print(current.value);
                current = current.next;
                System.out.print(i != size - 1 ? "->" : "");
            }
        }
        System.out.println();
    }

    // reverse
    public void reverse() {
        if (head == null) {
            System.out.println("linkedlist doesnot exist");
        } else {
            Node current = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(current.value);
                current = current.prev;
                System.out.print(i != size - 1 ? "->" : "");
            }
        }
        System.out.println();
    }

    // find
    public void find(int location) {
        if (head != null) {
            Node current = head;
            for (int i = 0; i < size; i++) {
                if (i == location) {
                    System.out.println("value at " + location + " is " + current.value);
                }
                current = current.next;
            }
        }
    }

    // delete node by index
    public void deleteNodebyIndex(int location) {
        Node current = head;
        if (head != null) {
            if (location == 0) {
                head = current.next;
                head.prev = null;
                size--;
            } else if (location >= size) {
                tail = tail.prev;
                tail.next = null;
                size--;
            } else {
                for (int i = 0; i < location - 1; i++) {
                    current = current.next;
                }
                current.next = current.next.next;
                current.next.prev = current;
                size--;
            }
        } else {
            System.out.println("linkedlist doesnot exist");
        }
    }

    // delete
    public void deleteDll() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            current.prev = null;

            current = current.next;
        }
        head = tail = null;
    }

}

class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int nodeValue) {
        this.value = nodeValue;
    }

}
