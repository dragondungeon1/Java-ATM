import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class User {

    private String firstname;

    private String lastname;

    private String uuid;

    private byte[] pincodeHash;

    private ArrayList<Account> accounts;


    public User(String firstname, String lastname, String pin, Bank bank) {

        this.firstname = firstname;
        this.lastname = lastname;

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            this.pincodeHash = messageDigest.digest(pin.getBytes());
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No Such Algorithm");
            e.printStackTrace();
        }

        // get a new uuid for user
        this.uuid = bank.getNewUserUUID();

        // create empty list of accounts
        this.accounts = new ArrayList<Account>();

        //print log msg
        System.out.printf("new user %s, %s with id: %s created \n", lastname,firstname,uuid);


    }
}
