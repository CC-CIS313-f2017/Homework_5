package com.company;

public interface ListIterator<E> {
    /**
     * Returns true if this list iterator has more element to traverse in the forward direction.
     * @return  true if the list iterator has more elements when traversing the list in the forward direction
     */
    boolean hasNext();

    /**
     * Returns true if this list iterator has more element to traverse in the reverse direction.
     * @return  true if the list iterator has more elements when traversing the list in the reverse direction
     */
    boolean hasPrevious();

    /**
     * Returns the next element in the list and advances the cursor position.
     * @return teh next element in the list
     */
    E next();

    /**
     * Returns the previous element in the list and moves the cursor position backwards.
     * @return the previous element in the list
     */
    E previous();


}
