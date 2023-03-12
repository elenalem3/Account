import java.util.Scanner;

public class TestAccountATM {
    private static Scanner input = new Scanner(System.in);

    private Account[] accounts = new Account[10];

    /** ������� ������ �������� � 10-� ����������� ������� � ������������ id � �������� */
    public TestAccountATM() {
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 10000);
        }
    }

    public static void main(String[] args) {
        TestAccountATM accountATM = new TestAccountATM();
        int id;

        while(true){
            System.out.print("������� id: ");
            id = input.nextInt();
            if (id < 0 || id > accountATM.accounts.length) {
                System.out.println("�������, ����������, ���������� id");
                continue;
            }

            while (true) {
                int choice = accountATM.getMenuSelection();
                if (choice == 1)
                    System.out.println("������ ����� " + accountATM.accounts[id].getBalance());
                else if (choice == 2)
                    accountATM.withdraw(id);
                else if (choice == 3)
                    accountATM.deposit(id);
                else
                    break;
            }
        }
    }

    /** ���������� ���� � �������� ���� �� ��� ������� */
    public int getMenuSelection() {
        int choice;

        while (true) {
            System.out.println("\n�������� ����");
            System.out.println("1: ��������� ������ �����");
            System.out.println("2: ����� �� �����");
            System.out.println("3: �������� �� ����");
            System.out.println("4: �����");
            System.out.print("������� ����� ����: ");
            choice = input.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("�� ����� ������������ ����� ����!");
            }
            else {
                break;
            }
        }
        return choice;
    }

    /** ������� � ���������� ����� ��������� ����� */
    public void withdraw(int id) {
        System.out.print("������� ����� ��� ������ �� �����: ");
        int amount = input.nextInt();
        if (amount < 0) {
            System.out.print("����� �������������! �������� ��������.");
        } else if (amount <= accounts[id].getBalance()) {
            accounts[id].withdraw(amount);
        } else {
            System.out.print("������������ ������� �� �����! �������� ��������.");
        }
    }

    /** ��������� ��������� ���� �� ��������� ����� */
    public void deposit(int id) {
        System.out.print("������� ����� ��� �������� �� ����: ");
        int amount = input.nextInt();
        if (amount >= 0) {
            accounts[id].deposit(amount);
        }
        else {
            System.out.print("����� �������������! �������� ��������.");
        }
    }
}
