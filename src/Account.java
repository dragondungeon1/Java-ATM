import java.util.ArrayList;

public class Account {

    private String name;

    private Double balance;

    private String uuid;

    private User user;

    private ArrayList<Transaction> transactions;

    public Account(String name, User user, Bank bank) {
        //set acc name and holder
        this.name = name;
        this.user = user;

        // get new acc uuid
        this.uuid = bank.getNewAccountUUID();


        this.transactions = new ArrayList<Transaction>();

        // add user and bank
        user.addAccount(this);
        bank.addAccount(this); 

    }

}
