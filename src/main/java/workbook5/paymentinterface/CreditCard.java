package workbook5.paymentinterface;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " amount using Credit Card");
    }

}
