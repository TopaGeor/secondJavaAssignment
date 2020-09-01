package exerciseSecond;

import java.util.List;

public interface IStore {
    /**
     *
     * @param product
     */
    void buy(Product product);

    /**
     *
     * @param product
     */
    void sell(Product product);

    /**
     *
     * @return
     */
    double getRevenue();
}
