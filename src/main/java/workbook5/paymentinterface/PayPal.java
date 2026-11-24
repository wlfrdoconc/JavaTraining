package workbook5.paymentinterface;

public class PayPal implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " amount using PayPal");
    }
}
