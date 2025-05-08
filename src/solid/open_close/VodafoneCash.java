package solid.open_close;

public class VodafoneCash implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("VodafoneCash");
    }
}
