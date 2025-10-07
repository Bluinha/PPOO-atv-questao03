/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new VanillaCake());
        order.addCake(new ChocolateCake());
        order.addCake(new MultiLayeredCake( new ChocolateCake()));
        order.addCake(new MultiLayeredCake( new SprinklesCake(new VanillaCake())));
        order.addCake(new WithSayingCake(new VanillaCake(), "one of") );
        order.addCake(new StrawberryCake());

        // Print the order
        order.printOrder();
    }
}
