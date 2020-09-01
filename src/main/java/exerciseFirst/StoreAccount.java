package exerciseFirst;

public class StoreAccount extends Account {
    private String storeName;
    private Category accountCategory;

    public StoreAccount(){}

    public StoreAccount(
            String owner,
            double balance,
            int numberOfTransactions,
            String storeName,
            Category category
    ){
        super(owner, balance, numberOfTransactions);
        this.storeName = storeName;
        this.accountCategory = category;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setAccountCategory(Category accountCategory) {
        this.accountCategory = accountCategory;
    }

    public String getStoreName() {
        return storeName;
    }

    public Category getAccountCategory() {
        return accountCategory;
    }

    public boolean changeCategory(Category newCategory){
        Category olderCategory = this.accountCategory;
        this.accountCategory = newCategory;
        return (!this.accountCategory.equals(olderCategory));
    }


    @Override
    public void testMethods(){
        System.out.println(" ");
        System.out.println("Children tests");
        System.out.println("Test 1");
        System.out.println("Store account category: " + this.accountCategory);
        Category differentCategory;
        if (this.accountCategory == Category.BASIC){
            differentCategory = Category.EXTRA;
        } else {
            differentCategory = Category.BASIC;
        }

        System.out.println("Try to change category with: " + differentCategory);
        System.out.println("The result should be a success");
        if (changeCategory(differentCategory)) {
            System.out.println("Success you manage to change the category: " + differentCategory);
        } else {
            System.out.println("Failed at changing category: " + differentCategory);
        }
    }
}
