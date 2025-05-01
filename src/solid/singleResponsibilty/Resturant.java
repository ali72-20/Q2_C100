package solid.singleResponsibilty;

public class Resturant {
    private Chef chef;
    private Waiter waiter;
    private Casher casher;

    public Resturant(Chef chef, Casher casher, Waiter waiter) {
        this.chef = chef;
        this.casher = casher;
        this.waiter = waiter;
    }

    public void makePasta() {
        waiter.getOrder();
        chef.prepareOrder();
        waiter.serviceOrder();
        casher.getCash();
    }
}
