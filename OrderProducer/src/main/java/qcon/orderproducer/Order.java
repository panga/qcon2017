package qcon.orderproducer;

public class Order {

    private final Integer id;
    private final String product;

    public Order(final Integer id, final String product) {
        this.id = id;
        this.product = product;
    }

    public Integer getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", product=" + product + '}';
    }

}
