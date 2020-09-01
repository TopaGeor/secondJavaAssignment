package exerciseSecond;

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
