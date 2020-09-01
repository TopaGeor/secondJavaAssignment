package exerciseSecond;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data

public class InventoryRetailStore implements IStore{
    private List<Product> products;
    private double totalBuyBalance = 0;
    private double totalSellBalance = 0;

    public InventoryRetailStore(){
        products = new ArrayList<>();
    }

    public void reset(){
        this.products.clear();
    }

    public List<Product> getInventory(){
        if (this.products.size() > 0) {
            this.products.forEach(System.out::println);
            return this.products;
        } else {
            return null;
        }
    }

    @Override
    public void buy(Product product) {
        this.products.add(product);
        this.totalBuyBalance += product.getPriceWhenBuy();
    }

    @Override
    public void sell(Product product) {
        if(this.products.stream().anyMatch(p -> p.getId() == product.getId())){
            this.products.remove(product);
            this.totalSellBalance += product.getPriceWhenSell();
        } else {
            System.out.println("You tried to sell a product that is not in the inventory");
        }
    }

    @Override
    public double getRevenue() {
        return this.totalSellBalance - totalBuyBalance;
    }
}
