package com.company;

import java.util.*;

public class DoublyLinkedList<E> implements List<E> {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size =0;
    }

    @Override
    public void add(E element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    /**
     * @param index Position of the node
     * @return The node at specified position
     */
    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }
    }

    @Override
    public int indexOf(Object obj) {
        if (size == 0) return -1;
        int i = 0;
        boolean found = false;
        Node node = head;
        while (i < size && !found) {
            if ((node.getData()).equals(obj)) {
                found = true;
            } else {
                i++;
                node = node.next;
            }
        }
        if (!found) return -1;
        return i;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new LinkedListIterator<>();
    }

    @Override
    public ListIterator<E> listIterator(boolean fromTail) {
        return new LinkedListIterator<>(fromTail);
    }

    /**
     * Appends the specified element at teh specified position inthis list
     *
     * @param index   the position where element is to be added
     * @param element the element to be added
     */
    @Override
    //NEED TO COMPLETE
    public void add(int index, E element) {

    }

    /**
     * Returns true if this list contains the specified element.
     *
     * @param obj The object that is searched for
     * @return true if the object is in the list, false otherwise
     */
    @Override
    //NEED TO COMPLETE
    public boolean contains(Object obj) {
        return false;
    }

    /**
     * @param index the specified position
     * @return the object at specified position
     */
    @Override
    //NEED TO COMPLETE
    public E get(int index) {
        return null;
    }

    /**
     * Returns true if list is empty
     *
     * @return true is list is empty, false otherwise.
     */
    @Override
    //NEED TO COMPLETE
    public boolean isEmpty() {
        return false;
    }

    /**
     * Removes element at given position from the list and returns it.
     *
     * @param index the specified position of the element to remove.
     * @return The element that was removed from list.
     */
    @Override
    //NEED TO COMPLETE
    public E remove(int index) {
        return null;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return the number of elements in the list.
     */
    @Override
    //NEED TO COMPLETE
    public int size() {
        return 0;
    }

    private class Node {
        private E data;
        private Node next;
        private Node previous;

        public Node(E data) {
            this.data = data;
            next = null;
            previous = null;
        }

        public Node(E data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    private class LinkedListIterator<E> implements ListIterator<E> {
        private int cursor;
        private Node nextNode;
        private Node previousNode;

        public LinkedListIterator() {
            cursor = 0;
            nextNode = head;
            previousNode = null;
        }

        LinkedListIterator(boolean fromTail) {
            if (fromTail) {
                cursor = size;
                nextNode = null;
                previousNode = tail;
            } else {
                new LinkedListIterator<>();
            }
        }


        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public boolean hasPrevious() {
            return false;
        }

        @Override
        public E next() {
            if (hasNext()) {
                cursor++;
                E temp = (E) nextNode.getData();
                previousNode = nextNode;
                nextNode = nextNode.next;
                return temp;
            }
            throw new NoSuchElementException();
        }

        @Override
        public E previous() {
            return null;
        }
    }
}
