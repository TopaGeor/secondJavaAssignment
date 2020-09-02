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

    /**
     * A constructor in order to set the products
     */
    public InventoryRetailStore(){
        products = new ArrayList<>();
    }

    /**
     * Clear the products list
     */
    public void reset(){
        this.products.clear();
    }

    /**
     * Print the inventory and return the products
     * @return a list of products
     */
    public List<Product> getInventory(){
        if (this.products.size() > 0) {
            this.products.forEach(System.out::println);
            return this.products;
        } else {
            return null;
        }
    }

    /**
     * add the product to the list and update total buy balance
     * @param product purchased product
     */
    @Override
    public void buy(Product product) {
        this.products.add(product);
        this.totalBuyBalance += product.getPriceWhenBuy();
    }

    /**
     * check if the product exist, removed if it does and update total sell balance
     * @param product product for selling
     */
    @Override
    public void sell(Product product) {
        if(this.products.stream().anyMatch(p -> p.getId() == product.getId())){
            this.products.remove(product);
            this.totalSellBalance += product.getPriceWhenSell();
        } else {
            System.out.println("You tried to sell a product that is not in the inventory");
        }
    }

    /**
     *
     * @return difference of total sell balance and total buy balance
     */
    @Override
    public double getRevenue() {
        return this.totalSellBalance - totalBuyBalance;
    }
}
