package solid.singleResponsibilty;

public class Chef {
    public String name;
    protected void prepareOrder() {
        System.out.println("Prepare order");
    }
}
