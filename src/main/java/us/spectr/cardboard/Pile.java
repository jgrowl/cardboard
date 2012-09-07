package us.spectr.cardboard;

import java.util.List;

/**
 * Represents a Pile
 *
 * User: jonathan
 * Date: 12/27/11
 * Time: 8:46 PM
 */
public interface Pile<T> extends Iterable<T> {

    /**
     * Determines if a pile still has items remaining in it.
     *
     * @return true if the pile still has items in it, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Pops an item from a specified index in the pile.
     *
     * Pre-condition: There must be an item that exists at the specified index.
     *
     * @param index The index of the item to be drawn.
     * @return An item.
     */
    public T remove(int index);

    /**
     * Pops an item from the top of the pile.
     *
     * Pre-conditions: The pile must not be empty.
     *
     * @return An item.
     */
    public T removeFirst();

    /**
     * Pops all items from the pile.
     *
     * Post-conditions: The pile will be empty.
     *
     * @return All of the items in the pile.
     */
    public List<T> removeAll();

    /**
     * Moves items from a specified pile to this pile.
     *
     * Post-conditions: Items will be added to this pile, but will not remain
     * in passed pile.
     *
     * @param pile The pile we are transferring.
     */
    public void transfer(Pile pile);

    /**
     * Adds a single item to the pile.
     *
     * @param item The item to be added.
     */
    public void add(T item);

    /**
     * Adds all specified items to the pile.
     *
     * @param items The item to add.
     */
    public void addAll(List<T> items);

    /**
     * Shuffles the pile.
     */
    public void shuffle();

}