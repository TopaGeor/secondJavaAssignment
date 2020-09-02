package exerciseSecond;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleRetailStore implements IStore {
    private double totalBuyBalance = 0;
    private double totalSellBalance = 0;

    /**
     * When you purchase a product, add the price when buy to total buy balance
     * @param product purchased product
     */
    @Override
    public void buy(Product product) {
        this.totalBuyBalance += product.getPriceWhenBuy();
    }

    /**
     * Whe you sell a product, add the price when sell to the total sell balance
     * @param product product for selling
     */
    @Override
    public void sell(Product product) {
        this.totalSellBalance += product.getPriceWhenSell();
    }

    /**
     *
     * @return the difference of total sell balance and total buy balance
     */
    @Override
    public double getRevenue() {
        return this.totalSellBalance - this.totalBuyBalance;
    }
}
