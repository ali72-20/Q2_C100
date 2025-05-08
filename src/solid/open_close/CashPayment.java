package solid.open_close;

public class CashPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("Cash payment");
    }
}
