package solid.open_close;

public class Fawery implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Fawery payment");
    }
}
