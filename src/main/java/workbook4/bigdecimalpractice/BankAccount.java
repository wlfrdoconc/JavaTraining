package workbook4.bigdecimalpractice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private BigDecimal balance;
    public BankAccount(String startingBalance) {
        this.balance = new BigDecimal(startingBalance).setScale(2, RoundingMode.
                HALF_UP);
    }
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }
    public void withdraw(BigDecimal amount) {
        if (amount.compareTo(balance) > 0) {
            System.out.println("Insufficient funds!");
            return;
        }
        balance = balance.subtract(amount);
    }
    public BigDecimal getBalance() {
        return balance;
    }
}

