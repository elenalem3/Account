public class TestAccount {
    public static void main(String[] args) {
        // Создать новый счет с id 1122 и начальным балансом 20 000 руб.
        Account account = new Account(1122, 20000);
        // Присвоить всем счетам годовую процентную ставку 4,5%
        Account.setAnnualInterestRate(4.5);
        // Снять 2 500 руб. с этого счета
        account.withdraw(2500);
        // Положить 3 000 руб. на этот счет
        account.deposit(3000);

        // Отобразить баланс и ежемесячный процент в руб., а также дату создания счета
        System.out.println("Баланс равен " + account.getBalance() + " руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
        System.out.println("Этот счет был создан " + account.getDateCreated());
    }
}
