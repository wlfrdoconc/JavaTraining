package workbook4.bigdecimalpractice;

import java.math.BigDecimal;

public class Main {

    // Output
    public static void main(String[] args) {
        BankAccount account = new BankAccount("100.00");
        account.deposit(new BigDecimal("50.00"));
        System.out.println("After deposit: " + account.getBalance());
        account.withdraw(new BigDecimal("30.00"));
        System.out.println("After withdrawal: " + account.getBalance());
        account.withdraw(new BigDecimal("1000.00")); //insufficient funds
        System.out.println("Final balance: " + account.getBalance());
    }
}

