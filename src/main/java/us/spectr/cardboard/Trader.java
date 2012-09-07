package us.spectr.cardboard;

import java.util.List;

/**
 * User: jonathan
 * Date: 9/5/12
 * Time: 10:09 PM
 */
public interface Trader<T, K> {

    /**
     * Gets a list of distinct tradable items regardless of if they are available.
     *
     * @return
     */
    public List<T> getCatalog();

    /**
     * Gets all available items for trade.
     *
     * @return
     */
    public List<T> getAvailable();

    /**
     * Gets a list of all unavailable items. The idea is that these items would normally be available for trade but may
     * be sold out or some other game specific reason.
     *
     * @return
     */
    public List<T> getUnavailable();

    /**
     * Gets all affordable items in stock given a specified offer.
     */
    public List<T> getAffordable(K offer);

    /**
     * Gets the number of the specified items remaining.
     *
     * @param item
     * @return
     */
    public int getNumberRemaining(T item);

    /**
     * Determines whether a trader would accept the offer for the specified item.
     *
     * @param item
     * @param offer
     * @return
     */
    public boolean isAcceptableOffer(T item, K offer);

    /**
     * Trades the item for the specified price.
     *
     * @param item
     * @param price
     * @return
     */
    public T trade(T item, K price);


}
