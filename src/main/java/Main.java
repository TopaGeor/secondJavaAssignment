import exerciseFirst.Account;
import exerciseFirst.Category;
import exerciseFirst.StoreAccount;

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
    }
}
