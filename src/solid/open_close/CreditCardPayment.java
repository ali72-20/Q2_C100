package solid.open_close;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Credit card");
    }
}
