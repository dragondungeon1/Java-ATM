import java.util.ArrayList;
import java.util.Random;

public class Bank {

    private String name;

    private ArrayList<User> users;

    private ArrayList<Account> accounts;



    public String getNewUserUUID() {

        String uuid;
        Random random = new Random();
        int len = 6;
        boolean nonUnique;

        do {

            uuid = "";
            for (int i = 0; i < len; i++) {
                uuid += ((Integer) random.nextInt(10)).toString();
            }
            nonUnique = true;
            for (User user : this.users) {
                if (uuid.compareTo(user.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }


        } while (true);

        return this.uuid;
    }

    public String getNewAccountUUID() {
        String uuid;
        Random random = new Random();
        int len = 6;
        boolean nonUnique;

        do {

            uuid = "";
            for (int i = 0; i < len; i++) {
                uuid += ((Integer) random.nextInt(10)).toString();
            }
            nonUnique = true;
            for (Account account : this.accounts) {
                if (uuid.compareTo(account.getUUID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }


        } while (true);

        return uuid;

    }


    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
