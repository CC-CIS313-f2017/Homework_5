package com.company;

public interface List<E> {
    /**
     * Appends the specified element to the end of this list
     * @param element   the element to be added
     */
    void add(E element);

    /**
     * Appends the specified element at teh specified position inthis list
    * @param index     the position where element is to be added
     * @param element   the element to be added
     */
    void add(int index,E element);

    /**
     * Returns true if this list contains the specified element.
     * @param  obj  The object that is searched for
     * @return true if the object is in the list, false otherwise
     */
    boolean contains(Object obj);

    /**
     *
     * @param index the specified position
     * @return  the object at specified position
     */
    E get(int index);

    /**
     * Returns true if list is empty
     * @return  true is list is empty, false otherwise.
     */
    boolean isEmpty();

    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
     * @param obj  element that is searched for
     * @return teh index of the first occurent of the object, or - 1 if object is not in the list
     */
    int indexOf(Object obj);

    /**
     * Returns a list iterator for this list.
     * @return  a ListIterator object for this list.
     */
    ListIterator<E> listIterator();

    /**
     * Returns a list iterator for this list.
     * @param fromTail INdicate whether iteration starts at the tail of the list.
     * @return  a ListIterator object for this list.
     */
    ListIterator<E> listIterator(boolean fromTail);

    /**
     * Removes element at given position from the list and returns it.
     * @param index  the specified position of the element to remove.
     * @return  The element that was removed from list.
     */
    E remove(int index);

    /**
     * Returns the number of elements in the list.
     * @return  the number of elements in the list.
     */
    int size();
}
