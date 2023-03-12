import java.util.ArrayList;

public class TestAccountWithTransaction {
    public static void main(String[] args) {
        Account.setAnnualInterestRate(5.5);

        Account account = new Account("Герман", 1122, 10000);

        account.deposit(300);
        account.deposit(400);
        account.deposit(500);

        account.withdraw(500);
        account.withdraw(400);
        account.withdraw(200);

        System.out.println("Имя: " + account.getName());
        System.out.println("Годовая процентная ставка: " + Account.getAnnualInterestRate());
        System.out.println("Баланс: " + account.getBalance());

        ArrayList<Transaction> transactions = account.getTransactions();

        System.out.println("\t\t\tДата\t\t\tТип транзакции\tСумма, руб.\tБаланс, руб.");

        for (Transaction transaction : transactions) {
            System.out.format("%28s%7c%17.2f%14.2f%n", transaction.getDate(), transaction.getType(),
                    transaction.getAmount(), transaction.getBalance());
        }
    }
}
