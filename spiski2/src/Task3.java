class DoublyCircularLinkedListSwapSort {
    private Node head;

    // вставка в конец
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

    // печчать
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

    // сортировка
    public void sortBySwappingAdjacent() {
        if (head == null || head.next == head) return; // пустой или 1 элемент

        boolean swapped;
        do {
            swapped = false;
            Node current = head;

            do {
                Node next = current.next;

                if (current.data > next.data) {
                    // меняем
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                    swapped = true;
                }

                current = current.next;
            } while (current.next != head);

        } while (swapped);
    }
}

public class Task3 {
    public static void main(String[] args) {
        DoublyCircularLinkedListSwapSort list = new DoublyCircularLinkedListSwapSort();
        list.insert(5);
        list.insert(2);
        list.insert(9);
        list.insert(1);
        list.insert(7);

        System.out.println("Исходный список:");
        list.printList();

        list.sortBySwappingAdjacent();

        System.out.println("Отсортированный список:");
        list.printList();
    }
}
