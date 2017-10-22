package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DoublyLinkedList<String> myList = new DoublyLinkedList<String>();
        myList.add("first");
        myList.add("second");
        myList.add("third");
        myList.add(1,"Added at index 1");
        myList.add(0,"Added at index 0");
        myList.add(2,"Added at index 2");
        myList.add(5,"Added at index 5");
        myList.add(7,"Added at index 7");

        System.out.println("Number of elements in the list: " + myList.size() +"\n");

        ListIterator<String> it = myList.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();

        ListIterator<String> itReverse = myList.listIterator(true);
        while(itReverse.hasPrevious()){
            System.out.println(itReverse.previous());
        }

        System.out.println("\nRemove element at index: " + 7);

        System.out.println("\nRemove element at index: " + 0);

        myList.remove(0);

        System.out.println("\nRemove element at index: " + 3);

        myList.remove(3);

        System.out.println();

        for(int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        System.out.println("\nfirst at index:" + myList.indexOf("first"));
        System.out.println("\nsecond at index:" + myList.indexOf("second"));
        System.out.println("\nthird at index:" + myList.indexOf("third"));
    }
}
