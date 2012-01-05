package cardboard;

import java.util.List;
import java.util.Map;

/**
 * User: jonathan
 * Date: 1/4/12
 * Time: 11:06 PM
 */
public class StandardMerchant<T> implements Merchant<T> {

    private Map<T, Pile<T>> piles;


    public List<T> getStock() {
        return null;
    }

    public List<T> getAffordableStock(Currency price) {
        return null;
    }

    public T buy(T t, Currency payment) {
        return null;
    }

    public int getNumberRemaining(T item) {
        return 0;
    }

    public int getNumberDepleted() {
        return 0;
    }

    public List<T> getDepletedStock() {
        return null;
    }

    public List<T> getCatalog() {
        return null;
    }
}
