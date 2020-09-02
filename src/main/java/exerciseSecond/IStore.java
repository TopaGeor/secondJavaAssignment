package exerciseSecond;

import java.util.List;

public interface IStore {
    /**
     * method for when you buy a product
     * @param product purchased product
     */
    void buy(Product product);

    /**
     * method for when you want to seel a product
     * @param product product for selling
     */
    void sell(Product product);

    /**
     * return revenue
     * @return revenue
     */
    double getRevenue();
}
