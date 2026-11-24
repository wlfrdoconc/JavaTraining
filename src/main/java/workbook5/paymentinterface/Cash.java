package workbook5.paymentinterface;

public class Cash implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " amount using Cash");
    }
}
