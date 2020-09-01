import exerciseFirst.Account;
import exerciseFirst.Category;
import exerciseFirst.StoreAccount;
import exerciseSecond.IStore;
import exerciseSecond.InventoryRetailStore;
import exerciseSecond.Product;
import exerciseSecond.SimpleRetailStore;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("me", 100, 0);
        account.testMethods();

        StoreAccount sAccount = new StoreAccount(
                "me",
                100,
                0,
                "Name",
                Category.MID);
        sAccount.testMethods();

        System.out.println();
        Product x1 = new Product(1, "Painting Picasso. Guernica", 100, 1000);
        Product x2 = new Product(2, "Painting Tsarouxis. Naftis A", 200, 2000);
        Product x4 = new Product(3, "Chair. Luis XV", 100, 1000);
        IStore simple= new SimpleRetailStore();
        simple.buy(x1);
        simple.buy(x4);
        simple.sell(x1);
        System.out.println(simple.getRevenue());

        System.out.println();
        IStore invStore = new InventoryRetailStore();
        invStore.buy(x1);
        invStore.buy(x2);
        invStore.sell(x1);
        System.out.println(invStore.getRevenue());
        invStore.sell(x2);
        ((InventoryRetailStore)invStore).getInventory();
    }
}
