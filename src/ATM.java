import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what is your name? ");
        String name = scanner.nextLine();


        System.out.printf("Hello %s. how old you? ", name);
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.printf("%d is very old what lang do you prefer? ", age);
        String lang = scanner.nextLine();


        System.out.printf("%s is very popular", lang);

        //always close connection to scanner, otherwise it will be open
        scanner.close();
    }
}
