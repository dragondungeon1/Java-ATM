import java.util.Date;

public class Transaction {

    private Double amount;

    private Date timestamp;

    private String memo;

    /**
     * The account in which the transaction was performed
     */
    private Account account;

}
