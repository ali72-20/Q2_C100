import solid.singleResponsibilty.Casher;
import solid.singleResponsibilty.Chef;
import solid.singleResponsibilty.Resturant;
import solid.singleResponsibilty.Waiter;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Casher casher = new Casher();
        Waiter waiter = new Waiter();
        Resturant resturant = new Resturant(chef,casher,waiter);
    }
}