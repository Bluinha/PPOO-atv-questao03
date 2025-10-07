public class CakeDecorator implements Cake {
    protected Cake decoratedCake;

    public CakeDecorator(Cake cake) {
        this.decoratedCake = cake;
    }

    @Override
    public String getDescription() {
        return  this.decoratedCake.getDescription();
    }
    @Override
    public double getCost() {
        return this.decoratedCake.getCost();
    }
}
