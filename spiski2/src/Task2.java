class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

class DoublyCircularLinkedList {
    private Node head;

    // Вставка элемента в конец списка
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    // Печать списка
    public void printList() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    private Node removeMinNode() {
        if (head == null) return null;

        Node current = head;
        Node minNode = head;

        do {
            if (current.data < minNode.data) {
                minNode = current;
            }
            current = current.next;
        } while (current != head);

        // Удаление минимального узла
        if (minNode == head && minNode.next == head) {
            head = null; // Список стал пустым
        } else {
            minNode.prev.next = minNode.next;
            minNode.next.prev = minNode.prev;
            if (minNode == head) {
                head = minNode.next;
            }
        }

        return minNode;
    }

    // Сортировкаа
    public void sortByRemovingMinToFront() {
        if (head == null || head.next == head) return; // Список пуст или состоит из одного элемента

        Node sortedHead = null;

        while (head != null) {
            Node minNode = removeMinNode();
            if (sortedHead == null) {
                sortedHead = minNode;
                sortedHead.next = sortedHead;
                sortedHead.prev = sortedHead;
            } else {
                minNode.next = sortedHead;
                minNode.prev = sortedHead.prev;
                sortedHead.prev.next = minNode;
                sortedHead.prev = minNode;
                sortedHead = minNode;
            }
        }

        head = sortedHead;
    }
}

public class Task2 {
    public static void main(String[] args) {
        DoublyCircularLinkedList list = new DoublyCircularLinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(9);
        list.insert(1);
        list.insert(7);

        System.out.println(" список:");
        list.printList();

        list.sortByRemovingMinToFront();

        System.out.println("сортированный список:");
        list.printList();
    }
}
