//Aplikacja jest najprostszym symulatorem bankomatu

package obiektyP;

import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Saldo: " + account.getBalance());

        System.out.println("Ile chcesz wpłacić na konto: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Saldo po wpłacie: " + account.getBalance());

        System.out.println("Ile chcesz wypłacić z konta: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Saldo po wypłacie: " + account.getBalance());

    }

}

class Account {
    private double balance;

    public Account() {
        this.balance = 0.0;
    }

    public void deposit(double value) {
        {
            this.balance += value;
        }

    }

    public void withdraw(double value) {
        {
            if (value <= this.balance) {
                this.balance -= value;
            } else {
                System.out.print("Za mało hajsu");
            }
        }

    }

    public double getBalance() {
        {
            return this.balance;
        }

    }
}
