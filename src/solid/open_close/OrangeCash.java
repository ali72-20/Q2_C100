package solid.open_close;

public class OrangeCash implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Orange Cash");
    }
}
