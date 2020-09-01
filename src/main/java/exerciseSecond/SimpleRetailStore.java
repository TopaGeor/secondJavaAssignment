package exerciseSecond;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimpleRetailStore implements IStore {
    private double totalBuyBalance;
    private double totalSellBalance;

    @Override
    public void buy(Product product) {
        this.totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        this.totalSellBalance += product.getPriceWhenSell();
    }

    @Override
    public double getRevenue() {
        return this.totalSellBalance - this.totalBuyBalance;
    }
}
