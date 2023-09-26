package SinglyLinkedList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createSinglyLinkedList(5);
        sll.insertFirst(4);
        sll.insertLast(9);
        sll.insertInLinkedList(7, 2);
        sll.insertInLinkedList(3, 8);

        ArrayList<Integer> list = sll.getNodes();
        System.out.println(list);
    }
}

class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // insert Node at first
    public void insertFirst(int nodeValue) {
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            node.next = head;
            head = node;
            size++;
        }

    }
    // insert Node at Last
    public void insertLast(int nodeValue) {
        if (head == null) {
            createSinglyLinkedList(nodeValue);
            return;
        } else {
            Node node = new Node();
            node.value = nodeValue;
            tail.next = node;
            node.next = null;
            tail = node;
            size++;
        }

    }
    // insert method
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSinglyLinkedList(nodeValue);
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

    public ArrayList<Integer> getNodes() {
        ArrayList<Integer> list = new ArrayList<>();
        Node current = head;
        while (current != null) {
            list.add(current.value);
            current = current.next;
        }
        return list;
    }
}

class Node {
    public int value;
    public Node next;
}