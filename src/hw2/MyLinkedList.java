package hw2;

import java.util.Collection;

public class MyLinkedList<T extends Comparable<T>> {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public MyLinkedList(Collection<? extends T> c) {
        this();
        this.addAll(c);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    private Node getNode(int position) {
        if (position < 1 || position > this.size) {
            throw new IndexOutOfBoundsException();
        }
        Node pointer = this.head;
        int iterCounter = 1;

        while (position != iterCounter) {
            iterCounter++;
            pointer = pointer.next;
        }

        return pointer;
    }

    public T get(int position) {
        return this.getNode(position).data;
    }

    public void add(T data) {
        if (this.isEmpty()) {
            this.head = new Node(data);
            this.tail = this.head;
            this.size++;
            return;
        }
        this.tail.next = new Node(data, this.tail);
        this.tail = this.tail.next;
        this.size++;
    }

    public void add(int position, T data) {
        if (position < 1 || position > this.size + 1) {
            throw new IndexOutOfBoundsException();
        }
        if (this.isEmpty() || position == this.size + 1) {
            this.add(data);
            return;
        }

        Node pointer = this.getNode(position);

        pointer.prev = new Node(data, pointer, pointer.prev);
        if (pointer.prev.prev != null) {
            pointer.prev.prev.next = pointer.prev;
        }
        if (pointer == this.head) {
            this.head = pointer.prev;
        }
        this.size++;
    }

    public void addAll(Collection<? extends T> c) {
        for (T item:c) {
            this.add(item);
        }
    }

    public void remove(int position) {
        if (position < 1 || position > this.size) {
            throw new IndexOutOfBoundsException();
        }

        Node pointer = this.getNode(position);

        if (pointer.prev != null) {
            pointer.prev.next = pointer.next;
            if (pointer == this.tail) {
                this.tail = pointer.prev;
            }
        }
        if (pointer.next != null) {
            pointer.next.prev = pointer.prev;
            if (pointer == this.head) {
                this.head = pointer.next;
            }
        }
        this.size--;
    }

    public void sort() {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int j = 1; j < this.size; j++) {
                Node temp1 = this.getNode(j);
                Node temp2 = this.getNode(j + 1);

                if (temp1.data.compareTo(temp2.data) > 0) {
                    T data = temp1.data;
                    temp1.data = temp2.data;
                    temp2.data = data;
                    isSorted = false;
                }
            }
        }
    }

    public void print() {
        for (int i = 1; i <= this.size; i++) {
            System.out.print(this.get(i) + " ");
        }
        System.out.println("\n");
    }

    private class Node {
        private T data;
        private Node next;
        private Node prev;

        private Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        private Node(T data, Node prev) {
            this(data);
            this.prev = prev;
        }

        private Node(T data, Node next, Node prev) {
            this(data);
            this.next = next;
            this.prev = prev;
        }
    }
}
