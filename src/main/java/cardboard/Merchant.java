package cardboard;

import java.util.List;

/**
 * User: jonathan
 * Date: 12/29/11
 * Time: 10:36 PM
 */
public interface Merchant<T> {

	/**
	 * Gets all items currently in stock.
	 *
	 * @return
	 */
	public List<T> getStock();

	/**
	 * Gets all affordable items in stock given a specified price.
	 *
	 */
	public List<T> getAffordableStock(Currency price);

    /**
     * Buys a specified item with a specified payment.
     * @param t
     * @param payment
     * @return
     */
	public T buy(T t, Currency payment);

    /**
     * Gets the number of the specified items remaining.
     *
     * @param item
     * @return
     */
    public int getNumberRemaining(T item);

    /**
     * Calculates the number of items that are depleted in the merchant.
     *
     * @return number of depleted card piles
     */
    public int getNumberDepleted();

    /**
     * Gets items that are out of stock.
     *
     * @return
     */
    public List<T> getDepletedStock();

    /**
     * Gets a list of all items normally for sale regardless of whether it is in stock.
     *
     * @return List of Cards for sale.
     */
    public List<T> getCatalog();

}
