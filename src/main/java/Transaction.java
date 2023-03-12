import java.util.Date;

public class Transaction {
    private Date date;
    /** Тип транзакции, где + пополнение, - списание */
    private char type;
    private double amount;
    private double balance;
    private String description;

    /** Создает транзакцию с указанным типом (+/-), суммой, балансом и описанием */
    public Transaction(char type, double amount, double balance, String description) {
        date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    /** Возвращает дату транзакции */
    public Date getDate() {
        return date;
    }

    /** Возвращает тип транзакции */
    public char getType() {
        return type;
    }

    /** Возвращает сумму транзакции */
    public double getAmount() {
        return amount;
    }

    /** Возвращает баланс после выполнения транзакции */
    public double getBalance() {
        return balance;
    }

    /** Возвращает описание транзакции */
    public String getDescription() {
        return description;
    }
}
