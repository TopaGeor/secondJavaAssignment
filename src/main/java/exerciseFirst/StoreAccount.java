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

    /**
     * set name of the store
     * @param storeName set store name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * Set the category of account
     * @param accountCategory set account category
     */
    public void setAccountCategory(Category accountCategory) {
        this.accountCategory = accountCategory;
    }

    /**
     * Return store name
     * @return store name
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * return account category
     * @return account category
     */
    public Category getAccountCategory() {
        return accountCategory;
    }

    /**
     * Changes category of the store
     * @param newCategory the new category
     * @return true if it is a success else return false
     */
    public boolean changeCategory(Category newCategory){
        Category olderCategory = this.accountCategory;
        this.accountCategory = newCategory;
        return (!this.accountCategory.equals(olderCategory));
    }

    /**
     * Test all class methods
     */
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
