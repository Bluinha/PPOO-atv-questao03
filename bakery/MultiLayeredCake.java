public class MultiLayeredCake extends CakeDecorator{
    public MultiLayeredCake(Cake cake){
        super(cake);
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.00;
    }
    @Override
    public String getDescription() {
        return "Multi-Layered" + super.getDescription();
    }
}
