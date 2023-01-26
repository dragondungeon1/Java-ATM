import java.util.Date;

public class Transaction {

    private Double amount;

    private Date timestamp;

    private String memo;

    /**
     * The account in which the transaction was performed
     */
    private Account account;

    public Transaction(Double amount, Account account) {
        this.amount = amount;
        this.account = account;
        this.timestamp = new Date();
        this.memo = "";
    }
    // java is insane, you can just have 2 constructors with the same name and different parameters
    public Transaction(Double amount, String memo, Account account) {
        this(amount, account);
        this.memo = memo;
    }

}
