public class Encapsulation {

    public static void main(StringExample[] args) {

        BankAccount A = new BankAccount();
        A.deposit(100, 280);
        System.out.println(A.getBalance());

    }
}

class BankAccount {

    private int balance;
    private int accountNumber;

    public void deposit(int balance, int accountNumber) {
        this.balance += balance;
        this.accountNumber += accountNumber;
    }

    public double getBalance() {

        return this.balance;

    }

}
