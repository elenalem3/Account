import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id; //идентификация банковского счета
    private double balance; //остаток на счете
    private static double annualInterestRate; //годовая процентная ставка по счету
    private Date dateCreated; //дата создания счета
    private String name; //имя владельца счета
    private ArrayList<Transaction> transactions = new ArrayList<>();

    /** Создает по умолчанию заданный банковский счет */
    public Account() {
        dateCreated = new Date();
    }

    /** Создает банковский счет с указанным id и балансом */
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    /** Создает банковский счет с указанным имени владельца счета, id и балансом */
    public Account(String name, int id, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }

    /** Возвращает id */
    public int getId() {
        return id;
    }

    /** Возвращает баланс */
    public double getBalance() {
        return balance;
    }

    /** Возвращает годовую процентную ставку */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /** Возвращает дату создания счета */
    public Date getDateCreated() {
        return dateCreated;
    }

    /** Возвращает имя клиента */
    public String getName() {
        return name;
    }

    /** Возвращает транзакции */
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    /** Присваивает новый id */
    public void setId(int id) {
        this.id = id;
    }

    /** Присваивает новый баланс */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /** Присваивает новую годовую процентную ставку */
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    /** Возвращает ежемесячный процент */
    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    /** Снимает со счета сумму */
    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('-', amount, balance, ""));
    }

    /** Пополняет счет сумму */
    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('+', amount, balance, ""));
    }
}
